package myself.l08advanceDFSBFS;

import java.util.*;

import java.util.*;

public class Main0803 {
    static int n, m, answer = Integer.MIN_VALUE;
    static int[] time, score;

    public void dfs(int level, int sum, int rt) {
        if (rt > m) return;
        if(level == n){
            answer = Math.max(answer, sum);
        }else{
            dfs(level + 1, sum + score[level], rt + time[level]);
            dfs(level + 1, sum, rt);
        }
    }

    public static void main (String[] args){

        Main0803 T = new Main0803();
        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();
        m = scanner.nextInt();

        time = new int[n];
        score = new int[n];

        for (int i = 0; i < n; i++) {
            score[i] = scanner.nextInt();
            time[i] = scanner.nextInt();
        }

        T.dfs(0,0, 0);

        System.out.println(answer);

    }
}
