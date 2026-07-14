/**
 * 메모리 상으로는 재귀기 비효율적이나 대기업에서 면접 시 나올 수 있음.
 */
package myself.l07recursiveTreeGraphDFSBFSbasic;

import java.util.*;


public class Main0704 {

    static int[] fibo;

    public int DFS(int N){
        if(fibo[N] > 0) return fibo[N];
        if(N == 1) return 1;
        else if(N == 2) return 2;
        else return fibo[N-1] + fibo[N-2];
    }

    public static void main(String[] args){
        Main0704 T = new Main0704();
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        fibo = new int[N+1] ;
        T.DFS(N);
        for(int x : fibo) System.out.println(x + " ");
    }
}
