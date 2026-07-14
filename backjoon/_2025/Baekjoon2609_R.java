package __backjoon__._2025;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 2609번 최대공약수와 최소공배수
 */
public class Baekjoon2609_R {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = br.read();


        String[] line = new String[T];
        int[] index = new int[T];
        for(int i = 0; i < T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            index[i] = Integer.parseInt(st.nextToken());
            line[i] = st.nextToken();
        }






    }

}
