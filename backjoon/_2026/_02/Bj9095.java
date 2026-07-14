/**
 * 457 -------------457
 */
package __backjoon__._2026._02;

import java.io.*;

public class Bj9095 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());

        for (int t = 1; t <= T; t++) {
            int N = Integer.parseInt(br.readLine());

            int[] dp = new int[11];
            dp[1] = 1;
            dp[2] = 2;
            dp[3] = 4;

            for (int i = 4; i <= N; i++) dp[i] = dp[i-1] + dp[i-2] + dp[i-3];

            bw.write(dp[N] + "\n");
        }
        bw.flush();
        bw.close();
    }
}
