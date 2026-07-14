/**
 */
package myself.l07recursiveTreeGraphDFSBFSbasic;

class Main0703 {
    public int DFS(int n){
        if(n == 1) return 1;
        else return n * DFS(n-1);
    }

    public static void main(String[] args){
        Main0703 T = new Main0703();
        System.out.println(T.DFS(6));
    }
}
