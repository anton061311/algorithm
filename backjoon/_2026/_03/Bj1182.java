package __backjoon__._2026._03;

import java.io.*;
import java.util.*;

public class Bj1182 {

    static int N, S;
    static int sum, answer;
    static int[] arr;

    public void dfs(int level, int sum) {

        if (level == N) {
            if(sum == S) answer++;
            return;
        }else{
            dfs(level + 1, sum + arr[level]);
            dfs(level + 1, sum);
        }
    }

    public static void main(String[] args){

        Bj1182 T = new Bj1182();
        Scanner scanner = new Scanner(System.in);

        N = scanner.nextInt();
        S = scanner.nextInt();

        arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        T.dfs(0, 0);

        if (S == 0) answer--;
        System.out.println(answer);
    }
}
