package __backjoon__._2026._03;

import java.io.*;
import java.util.*;

public class Bj1450 {
    static int N;
    static long C;
    static long[] arr;
    static ArrayList<Long> leftSums = new ArrayList<>();
    static ArrayList<Long> rightSums = new ArrayList<>();

    static void dfs(int start, int end, long sum, ArrayList<Long> list) {
        if (sum > C) return;
        if (start == end) {
            list.add(sum);
            return;
        }
        dfs(start + 1, end, sum, list);
        dfs(start + 1, end, sum + arr[start], list);
    }

    static int upperBound(ArrayList<Long> list, long target) {
        int lt = 0, rt = list.size();
        while (lt < rt) {
            int mid = (lt + rt) / 2;
            if (list.get(mid) <= target) lt = mid + 1;
            else rt = mid;
        }
        return lt;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        C = Long.parseLong(st.nextToken());

        arr = new long[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Long.parseLong(st.nextToken());
        }

        dfs(0, N / 2, 0, leftSums);
        dfs(N / 2, N, 0, rightSums);

        Collections.sort(rightSums);

        long answer = 0;
        for (long left : leftSums) {
            answer += upperBound(rightSums, C - left);
        }

        System.out.println(answer);
    }
}
