/**
 * 457 -------------457
 */
package __backjoon__._2026._02;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Bj1260 {

    static int vertax, edge, start;
    static int[][] graph;
    static boolean[] visited;

    static StringBuilder sb = new StringBuilder();
    static Queue<Integer> queue = new LinkedList<>();

    static void dfs(int start){
        visited[start] = true;
        sb.append(start + " ");

        for(int i = 0; i <= vertax; i++){
            if(graph[start][i] == 1 && !visited[i]) dfs(i);
        }
    }

    static void bfs(int start){
        queue.add(start);
        visited[start] = true;

        while(!queue.isEmpty()){

            start = queue.poll();
            sb.append(start + " ");

            for (int i = 1; i <= vertax; i++) {
                if(graph[start][i] == 1 && !visited[i]){
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }

    }

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        vertax = Integer.parseInt(st.nextToken());
        edge = Integer.parseInt(st.nextToken());
        start = Integer.parseInt(st.nextToken());

        graph = new int[vertax + 1][vertax + 1];

        for (int i = 0; i < edge; i++) {
            StringTokenizer str = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(str.nextToken());
            int b = Integer.parseInt(str.nextToken());

            graph[a][b] = graph[b][a] = 1;
        }

        visited = new boolean[vertax + 1];
        dfs(start);

        sb.append("\n");

        visited = new boolean[vertax + 1];
        bfs(start);

        System.out.println(sb);


        bw.flush();
        bw.close();
        br.close();
    }
}