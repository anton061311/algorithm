package myself.l08advanceDFSBFS;

import java.util.*;

public class Main0806 {
    static int N, M;
    static int[] pm, arr, ch;

    void dfs(int level){
        if(level == M){
            for(int x : pm) System.out.print(x + " ");
            System.out.println();
        }
        else{
            for (int i = 0; i < N; i++) {
                if(ch[i] == 0){
                    ch[i] = 1;
                    pm[level] = arr[i];
                    dfs(level + 1);
                    ch[i] = 0;
                }
            }
        }
    }

    public static void main (String[] args) {
        Main0806 T = new Main0806();
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        M = scanner.nextInt();

        arr = new int[N];
        ch = new int[N];
        pm = new int[M];

        for (int i = 0; i < N; i++) arr[i] = scanner.nextInt();

        T.dfs(0);
    }

}
