package myself.l07recursiveTreeGraphDFSBFSbasic;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main0714 {

    static int N, M;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] check, distance;

    public void BFS(int V) {
        Queue<Integer> queue = new LinkedList<>();
        check[V] = 1;
        distance[V] = 0;
        queue.offer(V);
        while(!queue.isEmpty()){
            int currentVertex = queue.poll();
            for(int nextVertex : graph.get(currentVertex)){
                if(check[nextVertex] == 0){
                    check[nextVertex] = 1;
                    queue.offer(nextVertex);
                    distance[nextVertex] = distance[currentVertex] + 1;
                }
            }
        }

    }

    public static void main(String[] args){

        Main0714 T = new Main0714();
        Scanner scanner = new Scanner(System.in);

        N = scanner.nextInt();
        M = scanner.nextInt();

        graph = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i <= N; i++) graph.add(new ArrayList<Integer>());
        check = new int[N+1];

        for (int i = 0; i < M; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            graph.get(a).add(b);
        }
//        check[1] = 1;
        T.BFS(1);
        for (int i = 2; i <= N; i++) {
            System.out.println(i + " : " + distance[i]);

        }

    }
}

