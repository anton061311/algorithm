package myself.l07recursiveTreeGraphDFSBFSbasic;

import java.util.ArrayList;
import java.util.Scanner;

public class Main0713 {

    static int N, M, answer = 0;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] check;

    public void DFS(int V) {
        if(V==N) answer++;
        else {
            for(int nextV : graph.get(V)) {
                if (check[nextV] == 0) {
                    check[nextV] = 1;
                    DFS(nextV);
                    check[nextV] = 0;
                }
            }
        }
    }

    public static void main(String[] args){

        Main0713 T = new Main0713();
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
        check[1] = 1;
        T.DFS(1);
        System.out.println(answer);

    }
}

