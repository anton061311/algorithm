package myself.l08advanceDFSBFS;

import java.util.*;

public class Main0807 {

    int[][] dy = new int[35][35];

    int dfs(int n, int r){
        if(dy[n][r] > 0) return dy[n][r];
        if(n == r || r ==0) return 1;
        else return dy[n][r] = dfs(n - 1, r - 1) + dfs(n - 1, r);
    }

    public static void main (String[] args) {

        Main0807 T = new Main0807();
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int R = sc.nextInt();

        System.out.println(T.dfs(N, R));

    }
}
