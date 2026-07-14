package __backjoon__._2026._02;

import java.io.*;
import java.util.*;

public class Bj11724 {

    static int vertax, edge, answer;
    static int[][] graph;
    static boolean[] visited;

    static void dfs(int v){
        visited[v] = true;
        for(int i = 1; i <= vertax; i++){
            if(graph[v][i] == 1 && !visited[i]) dfs(i);
        }
    }

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer input = new StringTokenizer(br.readLine(), " ");
        vertax = Integer.parseInt(input.nextToken());
        edge = Integer.parseInt(input.nextToken());

        visited = new boolean[vertax+1];
        graph = new int[vertax + 1][vertax + 1];

        for (int i = 0; i < edge; i++) {
            input = new StringTokenizer(br.readLine(), " ");
            int v = Integer.parseInt(input.nextToken());
            int u = Integer.parseInt(input.nextToken());

            graph[v][u] = graph[u][v] = 1;
        }

        for(int i = 1; i <= vertax; i++){
            if(!visited[i]){
                dfs(i);
                answer++;
            }
        }

        System.out.println(answer);
    }
}
