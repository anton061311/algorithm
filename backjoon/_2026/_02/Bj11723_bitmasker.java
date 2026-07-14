package __backjoon__._2026._02;

import java.io.*;
import java.util.*;

public class Bj11723_bitmasker {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int m = Integer.parseInt(br.readLine());
        int bit = 0;

        for (int t = 1; t <= m; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();

            switch (cmd) {
                case "add": {
                    int x = Integer.parseInt(st.nextToken());
                    bit |= (1 << (x - 1));
                    break;
                }
                case "remove": {
                    int x = Integer.parseInt(st.nextToken());
                    bit &= ~(1 << (x - 1));
                    break;
                }
                case "check": {
                    int x = Integer.parseInt(st.nextToken());
                    sb.append((bit & (1 << (x - 1))) != 0 ? 1 : 0).append('\n');
                    break;
                }
                case "toggle": {
                    int x = Integer.parseInt(st.nextToken());
                    bit ^= (1<< (x - 1));
                    break;
                }
                case "all":
                    bit = (1 << 20) - 1;
                    break;
                case "empty":
                    bit = 0;
                    break;
            }
        }

        System.out.print(sb);

    }
}
