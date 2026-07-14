package __backjoon__._2025;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon2231_R {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // 생성자를 저장할 변수
        int M = 0;

        // N이 최대 1,000,000이고, 각 자릿수 합의 최댓밗은 9 * 6 + 54
        // 범위를 (N-54) - N 으로 잡되, 1보다 작아지지 않도록
        int start = Math.max(1, N - 54); // ㅈ되는 거였누

        for (int i = start; i < N; i++) {
            int sumOfDigits = getSumOfDigits(i);
            int result = i + sumOfDigits;

            if (result == N) {
                M = i;
                break; // 가장 작은 생성자부터 검사하므로, 첫 발견 시 종료
            }
        }
        System.out.println(M);
    }

        // 자릿수 합을 구하는 메서드
        private static int getSumOfDigits(int num){
            int sum = 0;
            while(num > 0){
                sum += (num % 10 );
                num /= 10;
            }
            return sum;
        }
}
