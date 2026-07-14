package myself.l09greedy;

import java.io.*;
import java.util.*;

public class Main0907 {

    static int[] unf;

    static class Edge implements Comparable<Edge> {
        int v1, v2, cost;

        Edge(int v1, int v2, int cost){
            this.v1 = v1;
            this.v2 = v2;
            this.cost = cost;
        }

        @Override
        public int compareTo(Edge object){
            return this.cost - object.cost;
        }

    }

    static int find(int v){
        if(v == unf[v]) return v;
        else return unf[v] = find(unf[v]);
    }

    static void union(int a, int b){
        int fa = find(a);
        int fb = find(b);
        if(fa != fb) unf[fa] = fb;
    }

    public static void main (String[] args) throws Exception{
        Main0907 T = new Main0907();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int V = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());

        unf = new int[V + 1];
        for (int i = 1; i <= V; i++) unf[i] = i;

        ArrayList<Edge> arr = new ArrayList<>();
        for (int i = 1; i <= E; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            arr.add(new Edge(a, b, c));
        }

        int answer = 0;
        int cnt = 0;
        Collections.sort(arr);
        for(Edge object : arr){
            if(cnt == V - 1) break;
            int fv1 = find(object.v1);
            int fv2 = find(object.v2);
            if(fv1 != fv2){
                answer += object.cost;
                union(object.v1, object.v2);
            }
        }

        System.out.println(answer);
    }
}
