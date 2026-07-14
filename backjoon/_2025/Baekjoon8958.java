package __backjoon__._2025;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *     씨발 근데 왜 배열을 썼지? 어차피 매판 테스트마다 초기화 되니까 이전 테스트 케이스의
 *     입력값은 이후 케이스에서 필요가 없으니까 배열을 사요해서 굳이 메모리 소모를 할 필요가 없다.
 */
public class Baekjoon8958 {

    public static void main(String[] args) throws IOException {
//            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            String input = br.readLine();
            int totalScore = 0;
            int consecutive = 0;

            for (int j = 0; j < input.length(); j++) {
                if (input.charAt(j) == 'O') {
                    consecutive++;
                    totalScore += consecutive;
                } else {
                    consecutive = 0;
                }
            }

            System.out.println(totalScore);
        }
    }
}

