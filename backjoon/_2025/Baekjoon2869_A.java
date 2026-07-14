package __backjoon__._2025;

import java.io.*;
import java.util.StringTokenizer;

/**
 * "BufferedReader를 사용해 입력으로 한 줄의 문자열을 읽어오고,
 *  그 문자열을 인자로 하여 StringTokenizer 객체를 생성한 다음,
 *  st.nextToken()을 통해 순서대로 토큰들을 추출하여 a,b,c,에 저장한다."
 */
public class Baekjoon2869_A {

    public static void main(String[] args) throws IOException{
        //Scanner scanner = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());


        int count = 0;
        while(true){
            count++;
            V -= A;
            if(V <= 0){
                System.out.println(count);
                break;
            }
            V += B;
        }

        /**
         * - 객체 ab의 끝에 count의 문자열 표현을 이어 붙임.
         * - 객체 bw에 지정된 문자열을 출력 스트림을 사용하는 메서드
         * - .sb.toString()은 StringBuilder에 누적된 문자열 전체를 String 객체로 반환.
         */
        StringBuilder sb = new StringBuilder();
        sb.append(count); // 객체 ab의 끝에 count의 문자열 표현을 이어 붙임.
        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
