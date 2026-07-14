package __backjoon__._2025;

import java.io.*;
import java.util.StringTokenizer;

/**
 */
public class Baekjoon2675 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        int[] index = new int[T];
        String[] line = new String[T];

        for(int i = 0; i < T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            index[i] = Integer.parseInt(st.nextToken());
            line[i] = st.nextToken();
        }

        for(int i = 0; i < T; i++){
            for(int j = 0; j < line[i].length(); j++){
                for(int k = 0; k < index[i]; k++){
                    bw.append(String.valueOf(line[i].charAt(j)));
                }
            }
            bw.append("\n");
        }

        bw.flush();
        bw.close();
        br.close();


    }

}
