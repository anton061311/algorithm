package myself.l09greedy;

import java.io.*;
import java.util.*;


public class Main0904 {

    private static int N, max = Integer.MIN_VALUE;

    private static class Lecture implements Comparable<Lecture> {

        private final int pay, date;

        private Lecture(int pay, int date) {
            this.pay = pay;
            this.date = date;
        }

        @Override
        public int compareTo(Lecture other) {
//            return other.date - this.date;
            return Integer.compare(other.date, this.date);
        }
    }


    private int solution(ArrayList<Lecture> arr){

        int answer = 0;

        Collections.sort(arr);
        PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());

        int idx = 0;
        for (int i = max; i >= 1; i--) {
            while(idx < N && arr.get(idx).date >= i){
                pQ.offer(arr.get(idx).pay);
                idx++;
            }

            if(!pQ.isEmpty()){
                answer += pQ.poll();
            }
        }
        return answer;
    }

    public static void main (String[] args) throws Exception{
        Main0904 T = new Main0904();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        ArrayList<Lecture> arr = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int pay = Integer.parseInt(st.nextToken());
            int date = Integer.parseInt(st.nextToken());

            arr.add(new Lecture(pay, date));
            if(date > max) max = date;
        }

        System.out.println(T.solution(arr));
    }
}
