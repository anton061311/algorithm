package __backjoon__._2026._03;

import java.io.*;
import java.util.*;

public class Bj2805 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");


        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());

        int min = 0;
        int max = Arrays.stream(arr).max().getAsInt();
        while(min <= max){

            int mid = (min + max) / 2;
            long sum = 0;
            for (int tree : arr) {
                if(tree > mid){
                    sum += tree - mid;
                }
            }

            if(sum < M) max = mid - 1;
            else {
                min = mid + 1;
            }
        }

        System.out.println(min - 1);
    }
}
