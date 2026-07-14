package myself.l07recursiveTreeGraphDFSBFSbasic;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main0708 {

    private static final int[] moves = {-1, 1, 5};

    public int BFS(int S, int E){
        int[] visited = new int[10001];
        Queue<Integer> queue = new LinkedList<>();

        visited[S] = 1;
        queue.offer(S);

        int level = 0;

        while(!queue.isEmpty()){
            int length = queue.size();
            for (int i = 0; i < length; i++) {
                int cur = queue.poll();

                for (int j = 0; j < 3; j++){
                    int next = cur + moves[j];

                    if(next == E) return level + 1;

                    if(next >= 1 && next <= 10000 && visited[next] == 0){
                        visited[next] = 1;
                        queue.offer(next);
                    }
                }
            }
            level++;
        }

        return - 1;
    }

    public static void main(String[] args){
        Main0708 T = new Main0708();
        Scanner scanner = new Scanner(System.in);
        int S = scanner.nextInt();
        int E = scanner.nextInt();
        System.out.println(T.BFS(S, E));

    }
}
