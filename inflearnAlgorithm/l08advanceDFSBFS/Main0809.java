package myself.l08advanceDFSBFS;
import java.util.*;

public class Main0809 {

    static int N,M;
    static int[] register;

    void dfs(int depth, int start){
        if(depth == M){
            for(int x : register) System.out.print(x + " ");
            System.out.println();
        }
        else {
            for (int i = start; i <= N; i++){
                register[depth] = i;
                dfs(depth + 1, i + 1);
            }
        }

    }

    public static void main (String[] args) {
        Main0809 T = new Main0809();
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        M = scanner.nextInt();

        register = new int[M];

        T.dfs(0, 1);
    }

}
