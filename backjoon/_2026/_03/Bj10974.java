package __backjoon__._2026._03;

import java.io.*;

public class Bj10974 {
    static int N;
    static int[] pm;
    static boolean[] ch;
    static StringBuilder sb = new StringBuilder();

    static void dfs(int level) {
        if (level == N) {
            for (int i = 0; i < N; i++) {
                sb.append(pm[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 1; i <= N; i++) {
            if (!ch[i]) {
                ch[i] = true;
                pm[level] = i;
                dfs(level + 1);
                ch[i] = false;
            }
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        pm = new int[N];
        ch = new boolean[N + 1];

        dfs(0);
        System.out.print(sb);
    }
}
