package myself.l07recursiveTreeGraphDFSBFSbasic;

import java.util.LinkedList;
import java.util.Queue;

class Node0710{
    int data;
    Node0710 lt, rt;
    public Node0710(int val){
        data = val;
        lt = rt = null;
    }
}

public class Main0710 {

    Node0710 root;

    public int BFS(int L, Node0710 root){
        Queue<Node0710> queue = new LinkedList<>();
        queue.offer(root);

        int level = 0;

        while(!queue.isEmpty()){

            int length = queue.size();

            for (int i = 0; i < length; i++) {
                Node0710 current = queue.poll();
                if(current.lt == null && current.rt == null) return level;
                if(current.lt == null) queue.offer(current.lt);
                if(current.rt == null) queue.offer(current.rt);
            }
            level++;
        }
        return -1;
    }

    public static void main(String[] args){
        Main0710 tree = new Main0710();
        tree.root = new Node0710(1);
        tree.root.lt = new Node0710(2);
        tree.root.rt = new Node0710(3);
        tree.root.lt.lt = new Node0710(4);
        tree.root.lt.rt = new Node0710(5);
        System.out.println(tree.BFS(0, tree.root));
    }
}

