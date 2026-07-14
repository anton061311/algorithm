package __backjoon__._2026._03;

import java.io.*;
import java.util.*;

public class Bj18870 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] origin = new int[N];
        int[] sorted = new int[N];
        HashMap<Integer, Integer> map = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            origin[i] = Integer.parseInt(st.nextToken());
        }

        sorted = origin.clone();
        Arrays.sort(sorted);

        int idx = 0;
        for (int i = 0; i < N; i++) {
            if(!map.containsKey(sorted[i])) map.put(sorted[i], idx++);
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < N; i++) sb.append(map.get(origin[i]) + " ");

        System.out.println(sb);
        br.close();

    }
}
