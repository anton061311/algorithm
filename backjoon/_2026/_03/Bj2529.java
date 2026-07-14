package __backjoon__._2026._03;

import java.io.*;
import java.util.*;

public class Bj2529 {
    static int k;
    static char[] sign;
    static boolean[] visited = new boolean[10];
    static String min = "9999999999";
    static String max = "0";

    static void dfs(int depth, String num) {
        if (depth == k + 1) {
            if (num.compareTo(min) < 0) min = num;
            if (num.compareTo(max) > 0) max = num;
            return;
        }

        for (int i = 0; i <= 9; i++) {
            if (!visited[i]) {
                if (depth == 0 || valid(num.charAt(depth - 1) - '0', i, sign[depth - 1])) {
                    visited[i] = true;
                    dfs(depth + 1, num + i);
                    visited[i] = false;
                }
            }
        }
    }

    static boolean valid(int a, int b, char op) {
        if (op == '<') return a < b;
        else return a > b;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        k = Integer.parseInt(br.readLine());
        sign = new char[k];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < k; i++) {
            sign[i] = st.nextToken().charAt(0);
        }

        dfs(0, "");
        System.out.println(max);
        System.out.println(min);
    }
}
