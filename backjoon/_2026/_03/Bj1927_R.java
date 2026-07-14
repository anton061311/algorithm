package __backjoon__._2026._03;

import java.util.*;
import java.io.*;

public class Bj1927_R {


    public static void main (String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int turn = 0; turn < N; turn++) {
            int input = Integer.parseInt(br.readLine());

            if(input == 0){
                if(pq.isEmpty()){
                    sb.append("0\n");
                }else{
                    sb.append(pq.poll()).append("\n");
                }
            }else{
                pq.add(input);
            }

        }

        System.out.println(sb);

    }
}
