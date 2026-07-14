package __backjoon__._2026._03;

import java.io.*;
import java.util.*;

public class Bj6603 {
    static int k;
    static int[] arr, combi;
    static StringBuilder sb = new StringBuilder();

    static void dfs(int level, int start) {
        if (level == 6) {
            for (int i = 0; i < 6; i++) {
                sb.append(combi[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = start; i < k; i++) {
            combi[level] = arr[i];
            dfs(level + 1, i + 1);
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            k = Integer.parseInt(st.nextToken());

            if (k == 0) break;

            arr = new int[k];
            combi = new int[6];

            for (int i = 0; i < k; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            dfs(0, 0);
            sb.append("\n");
        }

        System.out.print(sb);
    }
}
