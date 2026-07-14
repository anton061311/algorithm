package __backjoon__._2026._04;

import java.io.*;

public class Bj5430_R {

    public static void main (String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for(int test = 0; test < T; test++){
            String P = br.readLine(); // 수행할 함수
            int N = Integer.parseInt(br.readLine()); // 배열의 길이
            String input = br.readLine(); // 배열 받기

            int[] arr = new int[N];

            if (N > 0){
                String inside = input.substring(1, input.length() - 1);
                String[] parts = inside.split(",");
                for (int i = 0; i < N; i++) {
                    arr[i] = Integer.parseInt(parts[i]);
                }
            }

            int left = 0;
            int right = N - 1;
            boolean reversed = false;
            boolean error = false;

            for(char cmd : P.toCharArray()){
                if (cmd == 'R'){
                    reversed = !reversed;
                }else {
                    if(left > right){
                        error = true;
                        break;
                    }

                    if(!reversed){
                        left++;
                    }else{
                        right--;
                    }
                }
            }

            if (error) {
                sb.append("error\n");
            } else {
                sb.append("[");
                if (!reversed){
                    for (int i = left; i <= right; i++){
                        sb.append(arr[i]);
                        if (i < right) sb.append(",");
                    }
                } else {
                    for (int i = right; i >= left; i--){
                        sb.append(arr[i]);
                        if (i > left) sb.append(",");
                    }
                }
                sb.append("]\n");

            }
        }

        System.out.println(sb);
    }
}
