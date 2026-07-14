package myself.l10dynamicProgramming;

import java.util.*;

public class Main1001 {

    static int[] dy;

    public int solution(int N){
        dy[1] = 1;
        dy[2] = 2;
        for(int i = 3; i <= N; i++){
            dy[i] = dy[i-1] + dy[i-2];
        }
        return dy[N];
    }

    public static void main (String[] args) {
        Main1001 T = new Main1001();
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        dy = new int[N + 1];

        System.out.println(T.solution(N));
    }
}
