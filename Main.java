import java.util.*;
import java.io.*;

public class Main {

    static int N, K;
    static boolean visit[];

    static void bfs(int start){
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{start, 0});
        visit[start] = true;

        while(!queue.isEmpty()){
            int p[] = queue.poll();
            if(p[0] == K){
                System.out.println(p[1]);
                return;
            }
            for(int i = 0; i < 3; i++){
                int next;
                int time;
                if(i == 0){
                    next = p[0]*2;
                    time = p[1];
                }
                else if (i == 1){
                    next = p[0] - 1;
                    time = p[1] + 1;
                }else {
                    next = p[0] + 1;
                    time = p[1] + 1;
                }

                if(0 <= next && next <= 10000 && !visit[next]){
                    queue.add(new int[]{next, time});
                    visit[next] = true;
                }
            }
        }
    }

    public static void main (String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        visit = new boolean[100001];

        bfs(N);
    }
}