package myself.l07recursiveTreeGraphDFSBFSbasic;
import java.util.LinkedList;
import java.util.Queue;

class Node0707{
    int data;
    Node0707 lt, rt;
    public Node0707(int val){
        data = val;
        lt = rt = null;
    }
}

public class Main0707 {
    Node0707 root;
    public void BFS(Node0707 root){
        Queue<Node0707> queue = new LinkedList<>();
        queue.offer(root);
        int level = 0;
        while(!queue.isEmpty()){
            int length = queue.size();
            System.out.print(level + " : ");
            for(int i = 0; i < length; i++){
                Node0707 currentNode0707 = queue.poll();
                System.out.print(currentNode0707.data + " ");
                if(currentNode0707.lt != null) queue.offer(currentNode0707.lt);
                if(currentNode0707.rt != null) queue.offer(currentNode0707.rt);
            }
            level++;
            System.out.println();
        }

    }

    public static void main(String[] args){
        Main0707 tree = new Main0707();
        tree.root = new Node0707(1);
        tree.root.lt = new Node0707(2);
        tree.root.rt = new Node0707(3);
        tree.root.lt.lt = new Node0707(4);
        tree.root.lt.rt = new Node0707(5);
        tree.root.rt.lt = new Node0707(6);
        tree.root.rt.rt = new Node0707(7);
        tree.BFS(tree.root);
    }
}
