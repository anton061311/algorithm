package __backjoon__._2025;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 1회: 1      1개
 * 2회: 2-7    6개
 * 3회: 8-19  12개
 * 4회: 20-37 18개
 * 5회: 38-61 24개
 *
 *  = 알고 보니, 굉장히 단순한 패턴이었다. 경로 수와 범위 인자를 토대로 예측할 수 있는 패턴이었음.
 *  = 결국 패턴을 예측하려면 파라미터 요소와 파라미터의 자료형을 우선적으로 파악해보자.
 */
public class Baekjoon2292_R {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int count = 1;
        int maxNum = 1;


        while(maxNum < N){
            maxNum += 6 * count;
            count++;
        }

        System.out.println(count);

        br.close();
    }
}
