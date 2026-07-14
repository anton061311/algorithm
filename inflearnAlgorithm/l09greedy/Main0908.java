package myself.l09greedy;

import java.io.*;
import java.util.*;

public class Main0908 {

    static class Edge implements Comparable<Edge> {
        int vex, cost;

        Edge(int vex, int cost){
            this.vex = vex;
            this.cost = cost;
        }

        @Override
        public int compareTo(Edge object){
            return this.cost - object.cost;
        }

    }

    public static void main (String[] args) throws Exception{
        Main0908 T = new Main0908();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int V = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());

        ArrayList<ArrayList<Edge>> graph = new ArrayList<ArrayList<Edge>>();
        for (int i = 0; i <= V; i++) {
            graph.add(new ArrayList<Edge>());
        }

        int[] ch = new int[V + 1];
        for (int i = 0; i < E; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            graph.get(a).add(new Edge(b,c ));
            graph.get(b).add(new Edge(a,c ));
        }

        int answer = 0;
        PriorityQueue<Edge> pq = new PriorityQueue<>();
        pq.offer(new Edge(1,0));
        while(!pq.isEmpty()){
            Edge tmp = pq.poll();
            int ev = tmp.vex;
            if(ch[ev] == 0){
                ch[ev] = 1;
                answer += tmp.cost;
                for(Edge ob : graph.get(ev)){
                    if(ch[ob.vex] == 0) pq.offer(new Edge(ob.vex, ob.cost));
                }
            }
        }

        System.out.println(answer);
    }
}
