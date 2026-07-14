package myself.l09greedy;

import java.io.*;
import java.util.*;


public class Main0903 {

    static class Time implements Comparable<Time> {

        public int time;
        public char state;

        public Time(int time, char state) {
            this.time = time;
            this.state = state;
        }

        @Override
        public int compareTo(Time ob){
            if(this.time == ob.time) return this.state - ob.state;
            else return this.time - ob.time;
        }

    }

    int solution(ArrayList<Time> arr){

        int answer = Integer.MIN_VALUE;

        Collections.sort(arr);
        int cnt = 0;
        for(Time ob : arr){
            if(ob.state == 's') cnt++;
            else cnt--;
            answer = Math.max(answer, cnt);
        }

        return answer;
    }

    public static void main (String[] args) throws Exception{

        Main0903 T = new Main0903();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        ArrayList<Time> arr = new ArrayList<>();

        for (int i = 0; i < N; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int startTime = Integer.parseInt(st.nextToken());
            int endTime = Integer.parseInt(st.nextToken());

            arr.add(new Time(startTime, 's'));
            arr.add(new Time(endTime, 'e'));
        }

        System.out.println(T.solution(arr));
    }
}
