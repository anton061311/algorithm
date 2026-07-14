package __backjoon__._2026._02;

import java.util.*;
import java.io.*;

public class Bj2606 {

    static int[][] graph;
    static int node, edge, count;
    static boolean[] visited;

    public static void dfs(int start) {

        visited[start] = true;
        count++;

        for (int i = 0; i <= node; i++) {
            if(graph[start][i] == 1 && !visited[i]) dfs(i);
        }

    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        node = Integer.parseInt(br.readLine());
        edge = Integer.parseInt(br.readLine());

        graph = new int[node + 1][node + 1];
        visited = new boolean[node + 1];

        for (int i = 0; i < edge; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph[a][b] = graph[b][a] = 1;
        }

        dfs(1);
        System.out.println(count - 1);
    }

}
