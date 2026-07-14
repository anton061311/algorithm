package myself.l10dynamicProgramming;

import java.util.*;

public class Main1006 {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] dy = new int[M + 1];

        for (int i = 0; i < N; i++) {
            int ps = scanner.nextInt();
            int pt = scanner.nextInt();
            for (int j = M; j >= pt; j--) {
                dy[j] = Math.max(dy[j], dy[j - pt] + ps);
            }
        }

        System.out.println(dy[M]);
    }
}
