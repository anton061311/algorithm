package myself.l10dynamicProgramming;

import java.util.*;

public class Main1002 {

    static int[] dy;

    public int solution(int N){
        dy[1] = 1;
        dy[2] = 2;
        for(int i = 3; i <= N + 1; i++){
            dy[i] = dy[i-1] + dy[i-2];
        }
        return dy[N+1];
    }

    public static void main (String[] args) {
        Main1002 T = new Main1002();
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        dy = new int[N + 2];

        System.out.println(T.solution(N));
    }
}
