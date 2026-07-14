package myself.l09greedy;

import java.io.*;
import java.util.*;
class Body implements Comparable<Body> {
    public int height, weight;

    public Body(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Body o){
        return o.height - this.height;
    }
}

public class Main0901 {


    int solution(ArrayList<Body> arr, int n){
        int cnt = 0;
        Collections.sort(arr);
        int max = Integer.MIN_VALUE;

        for(Body ob : arr){
            if(ob.weight > max){
                max = ob.weight;
                cnt++;
            }
        }

        return cnt;
    }

    public static void main (String[] args) throws Exception{
        Main0901 T = new Main0901();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        ArrayList<Body> arr = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int height = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());
        }
        System.out.println(T.solution(arr, N));

    }
}
