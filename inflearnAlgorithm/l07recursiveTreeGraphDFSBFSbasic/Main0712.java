package myself.l07recursiveTreeGraphDFSBFSbasic;
import java.util.Scanner;

public class Main0712 {

    static int N, M, answer = 0;
    static int[][] graph;
    static int[] check;

    public void DFS(int V) {
        if (V == N) answer++;
        else {
            for (int i = 0; i <= N; i++) {
                if (graph[V][i] == 1 && check[i] == 0) {
                    check[i] = 1;
                    DFS(i);
                    check[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args){

        Main0712 T = new Main0712();
        Scanner scanner = new Scanner(System.in);

        N = scanner.nextInt();
        M = scanner.nextInt();

        graph = new int[N+1][N+1];
        check = new int[N+1];

        for (int i = 0; i < M; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            graph[a][b] = 1;
        }
        check[1] = 1;
        T.DFS(1);
        System.out.println(answer);

    }
}

