package myself.l10dynamicProgramming;

import java.util.*;

public class Main1005 {

    static int N, M;
    static int[] dy;

    public int solution(int[] coin){
        Arrays.fill(dy, Integer.MAX_VALUE);
        dy[0] = 0;

        for (int i = 0; i < N; i++) {
            for (int j = coin[i]; j <= M; j++) {
                dy[j] = Math.min(dy[j], dy[j - coin[i]] + 1);
            }
        }
        return dy[M];
    }

    public static void main (String[] args) {
        Main1005 T = new Main1005();
        Scanner scanner = new Scanner(System.in);

        N = scanner.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        M = scanner.nextInt();
        dy = new int[M + 1];
        System.out.println(T.solution(arr));
    }
}
