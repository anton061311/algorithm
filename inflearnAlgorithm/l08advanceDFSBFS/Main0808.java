package myself.l08advanceDFSBFS;

/**
 * 3c0 3c1 3c2 3c3
 *   4c1 4c2 4c3
 *     5c2 5c3
 *       6c3
 */

import java.util.*;

public class Main0808 {

    static int N, F;
    static int[] coefficient, permutation;
    static int[][] memo = new int[35][35];
    static boolean found;
    static boolean[] check;

    void dfs(int depth, int sum) {
        if (found) return;

        if (depth == N) {
            if (sum == F) {
                for (int x : permutation) System.out.print(x + " ");
                found = true;
            }
            return;
        } else {
            for (int i = 1; i <= N; i++) {
                if (!check[i]) {
                    check[i] = true;
                    permutation[depth] = i;
                    dfs(depth + 1, sum + (permutation[depth] * coefficient[depth]));
                    check[i] = false;
                }
            }
        }
    }

    int setComb(int n, int r) {
        if (memo[n][r] > 0) return memo[n][r];
        if (n == r || r == 0) return 1;
        else return memo[n][r] = setComb(n - 1, r - 1) + setComb(n - 1, r);
    }

    public static void main(String[] args) {
        Main0808 T = new Main0808();
        Scanner scanner = new Scanner(System.in);

        N = scanner.nextInt();
        F = scanner.nextInt();

        coefficient = new int[N];
        permutation = new int[N];
        check = new boolean[N + 1];

        for (int i = 0; i < N; i++) coefficient[i] = T.setComb(N - 1, i);

        T.dfs(0, 0);
    }
}
