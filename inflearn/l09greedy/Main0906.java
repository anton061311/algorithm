package myself.l09greedy;

import java.io.*;
import java.util.*;


public class Main0906 {

    static int[] unf;

    static int find(int v){
        if(v == unf[v]) return v;
        else return unf[v] = find(unf[v]);
    }

    static void union(int a, int b){
        int fa = find(a);
        int fb = find(b);
        if(fa != fb) unf[fa] = unf[fb];
    }

    public static void main (String[] args) throws Exception{
        Main0906 T = new Main0906();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        unf = new int[N + 1];
        for (int i = 1; i <= N; i++) unf[i] = i;

        for (int i = 1; i <= M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            union(a, b);
        }

        st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int fa = find(a);
        int fb = find(b);
        if(fa == fb) System.out.println("YES");
        else System.out.println("NO");
    }
}
