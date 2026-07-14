package myself.l09greedy;

import java.io.*;
import java.util.*;

class Time implements Comparable<Time> {
    public int s, e;

    public Time(int s, int e) {
        this.s = s;
        this.e = e;
    }

    @Override
    public int compareTo(Time o){
        if(o.e == this.e) return this.s - o.s;
        else return this.e - o.e;
    }

}

/**
 * 2 3
 * 1 4
 * 3 5
 * 4 6
 * 5 7
 */

public class Main0902 {

    int solution(ArrayList<Time> arr, int N){
        int cnt = 0;
        Collections.sort(arr);
        int endTime = 0;

        for(Time ob : arr){
            if(ob.s >= endTime){
                cnt++;
                endTime = ob.e;
            }
        }

        return cnt;
    }

    public static void main (String[] args) throws Exception{
        Main0902 T = new Main0902();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        ArrayList<Time> arr = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            arr.add(new Time(start, end));
        }
        System.out.println(T.solution(arr, N));

    }
}
