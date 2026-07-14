package myself.l07recursiveTreeGraphDFSBFSbasic;

class Node0705{
    int data;
    Node0705 lt, rt;
    public Node0705(int val){
        data = val;
        lt = rt = null;
    }
}

public class Main0705 {
    Node0705 root;
    public void DFS(Node0705 root){
        if(root == null) return;
        else{
            // 중위 전위 후위에 따라 순서 바뀜
            DFS(root.lt);
            System.out.println(root.data + " ");
            DFS(root.rt);
        }
    }

    public static void main(String[] args){
        Main0705 tree = new Main0705();
        tree.root = new Node0705(1);
        tree.root.lt = new Node0705(2);
        tree.root.rt = new Node0705(3);
        tree.root.lt.lt = new Node0705(4);
        tree.root.lt.rt = new Node0705(5);
        tree.root.rt.lt = new Node0705(6);
        tree.root.rt.rt = new Node0705(7);
        tree.DFS(tree.root);
    }
}
