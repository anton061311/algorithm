package myself.l07recursiveTreeGraphDFSBFSbasic;

import java.util.*;


public class Main0701 {

    public void DFS(int N){
        if(N ==0) return;
        else{
            DFS(N-1);
            System.out.print(N + " ");
        }
    }

    public static void main(String[] args){
        Main0701 T = new Main0701();
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        T.DFS(N);
    }
}
