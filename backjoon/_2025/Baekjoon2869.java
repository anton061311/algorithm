package __backjoon__._2025;


import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon2869 {

        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            StringTokenizer st = new StringTokenizer(br.readLine());

            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int V = Integer.parseInt(st.nextToken());

            int dayCount = (V - B - 1) / (A - B) + 1;

            bw.write(String.valueOf(dayCount));
            bw.flush();
            bw.close();
            br.close();
    }

}