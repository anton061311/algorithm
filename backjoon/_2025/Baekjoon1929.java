package __backjoon__._2025;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon1929 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for(int i = N; i <= M; i++){
            if(isPrime(i)){
                bw.append(i + "\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }

    static boolean isPrime(int num){
        if(num<2)   return false;
        for(int i = 2; i * i <= num; i++){
            if(num % i == 0) return false;
        }
        return true;
    }

}
