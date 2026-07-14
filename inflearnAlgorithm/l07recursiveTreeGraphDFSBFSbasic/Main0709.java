package myself.l07recursiveTreeGraphDFSBFSbasic;

class Node0709{
    int data;
    Node0709 lt, rt;
    public Node0709(int val){
        data = val;
        lt = rt = null;
    }
}

public class Main0709 {
    Node0709 root;
    public int DFS(int L, Node0709 root){
        if(root.lt == null && root.rt == null) return L;
        else return Math.min(DFS(L+1, root.lt), DFS(L+1, root.rt));
    }

    public static void main(String[] args){
        Main0709 tree = new Main0709();
        tree.root = new Node0709(1);
        tree.root.lt = new Node0709(2);
        tree.root.rt = new Node0709(3);
        tree.root.lt.lt = new Node0709(4);
        tree.root.lt.rt = new Node0709(5);
        System.out.println(tree.DFS(0, tree.root));
    }
}

