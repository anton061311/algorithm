package myself.l09greedy;

import java.io.*;
import java.util.*;


public class Main0905 {

    static int N, M;
    static ArrayList<ArrayList<Edge>> graph;
    static int[] dist;

    static class Edge implements Comparable<Edge> {
        int vex, cost;

        public Edge(int vex, int cost) {
            this.vex = vex;
            this.cost = cost;
        }

        @Override
        public int compareTo(Edge o){
            return this.cost - o.cost;
        }
    }

    static void dijkstra(int start){
        PriorityQueue<Edge> pq = new PriorityQueue<>();
        dist[start] = 0;
        pq.offer(new Edge(start, 0));

        while (!pq.isEmpty()) {
            Edge cur = pq.poll();

            if(cur.cost > dist[cur.vex]) continue;

            for(Edge next : graph.get(cur.vex)) {
                if(dist[next.vex] > cur.cost + next.cost) {
                    dist[next.vex] = cur.cost + next.cost;
                    pq.offer(new Edge(next.vex, dist[next.vex]));
                }
            }
        }
    }

    public static void main (String[] args) throws Exception{
        Main0905 T = new Main0905();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        graph = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }

        dist = new int[N + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());

            graph.get(from).add(new Edge(to, cost));
        }

        dijkstra(1);

        StringBuilder sb = new StringBuilder();
        for (int i = 2; i <= N; i++) {
            sb.append(i).append(" : ");
            if(dist[i] == Integer.MAX_VALUE){
                sb.append("impossible");
            } else {
                sb.append(dist[i]);
            }
            sb.append('\n');
        }

        System.out.print(sb);
    }
}
