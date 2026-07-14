package myself.l08advanceDFSBFS;

import java.util.*;

public class Main0802 {

    static int answer = Integer.MIN_VALUE, C, N;
    static int[] arr;

    public void dfs(int L, int sum) {
        if(sum > C) return;
        if (L == N) {
            answer = Math.max(answer, sum);
        }else{
            dfs(L+1, sum+arr[L]);
            dfs(L+1, sum);
        }
    }

    public static void main (String[] args){

        Main0802 T = new Main0802();
        Scanner scanner = new Scanner(System.in);

        C = scanner.nextInt();
        N = scanner.nextInt();
        arr = new int[N];
        for (int i = 0; i < N; i++) arr[i] = scanner.nextInt();

        T.dfs(0, 0);

        System.out.println(answer);
    }
}
