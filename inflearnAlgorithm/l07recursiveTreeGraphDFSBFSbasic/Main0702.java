/**
 *  - 대부분의 재귀는 if, else 문으로 완성됨
 */
package myself.l07recursiveTreeGraphDFSBFSbasic;

import java.util.*;


public class Main0702 {

    public void DFS(int N){
        if(N == 0) return;
        else{
            DFS(N/2);
            System.out.print(N%2 + " ");
        }
    }

    public static void main(String[] args){
        Main0702 T = new Main0702();
        Scanner kb = new Scanner(System.in);
        T.DFS(kb.nextInt());
    }
}
