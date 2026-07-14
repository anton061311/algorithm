package __backjoon__._2025;

import java.io.*;
import java.util.StringTokenizer;

/**
 *  - 문제 상황
 *   . 그냥 걷기가 싫음. 그래서 103호보다 301호를 선호.
 *   . W가 낮은 것보다 채움. W가 같을 경우 H가 낮은 순서부터
 *   . N자로 채움
 *
 *  - 조건
 *   . 테스트 케이스 T
 *   . 1 <= H
 *   . W <= 99
 *   . 1 <= N <= H * W
 *
 *
 *   - 결론
 *     -> 씨발 근데 왜 배열을 썼지? 어차피 매판 테스트마다 초기화 되니까 이전 테스트 케이스의
 *        입력값은 이후 케이스에서 필요가 없으니까 배열을 사요해서 굳이 메모리 소모를 할 필요가 없다.
 *
 *      <do - while문>
 *      1. do 블록의 코드를 실행
 *      2. while에 지정된 조건을 검사
 *      3. 조건이 참이면 다시 do블록으로 돌아가 코드를 실행
 *      4. 거짓이면 반복문을 종료
 */
public class Baekjoon10250 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        do{
            StringTokenizer st = new StringTokenizer(br.readLine());
            int H = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());

            int floor = N % H;
            int num = N / H;
            if(floor == 0){
                floor = H;
            }else {
                num += 1;
            }

            String roomNumber = String.valueOf(floor) + ((num < 10) ? "0" + num : num);
            bw.write(roomNumber + "\n");

            T--;
        }while(T > 0);


        bw.flush();
        bw.close();
        br.close();


    }

}
