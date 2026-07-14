package __backjoon__._2025;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

/**
 *
 */
public class Baekjoon1181 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        String[] line = new String[N];

        for(int i = 0; i < N; i++){
            line[i] = br.readLine();
        }

        Arrays.sort(line, new Comparator<String>() {
            public int compare(String s1, String s2){
                if(s1.length() == s2.length()){
                    return s1.compareTo(s2);
                }
                else {
                    return s1.length() - s2.length();
                }
            }
        });

        bw.write(line[0] + "\n");

        for(int i = 1; i < N; i++){
            if(!line[i].equals(line[i - 1])){
                bw.write(line[i] + "\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
