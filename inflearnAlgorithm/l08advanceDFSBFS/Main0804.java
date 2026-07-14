package myself.l08advanceDFSBFS;

import java.util.*;
class Main0804{

    static int n, m;
    static int[] pm;

    public void dfs(int level){
        if(level == m){
            for(int x : pm) System.out.print(x + " ");
        }
        else{
            for(int i = 1; i <= n; i++){
                pm[level] = i;
                dfs(level + 1);
            }
        }
    }
    public static void main(String[] args){
        Main0804 T = new Main0804();
        Scanner kb = new Scanner(System.in);

        n=kb.nextInt();
        m=kb.nextInt();

        pm = new int[m];
        T.dfs(0);
    }
}
