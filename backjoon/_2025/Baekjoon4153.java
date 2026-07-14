package __backjoon__._2025;

import java.io.*;
import java.util.StringTokenizer;

// 4153 -> 1978 -> 9012

/**
 * 1. 세 정수를 입력 받고 공백 단위로 토큰화 한 다음
 * 2. 조건식이 맞다면 bw에 append 할 것
 * 3. flush 및 close
 */
public class Baekjoon4153 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        // br.readLine()은 메서드이고 호출할 때마다 다음라인을 읽으므로ㅇㅇ
        String line;
        while ((line = br.readLine())!= null){
            StringTokenizer st = new StringTokenizer(line);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if(a == 0 && b == 0 && c == 0){
                break;
            }

            // Math.max 를 몰랐음
            int max = Math.max(a,Math.max(b,c));
            int sum = 0;
            if(max == a){
               sum = b*b + c*c;
            }else if(max == b){
                sum = a*a + c*c;
            }else {
                sum = a*a + b*b;
            }

            if(max*max == sum){
                bw.append("right\n");
            } else{
                bw.append("wrong\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }

}

