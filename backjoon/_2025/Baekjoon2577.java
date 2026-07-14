package __backjoon__._2025;

import java.io.*;

/**
 *     씨발 근데 왜 배열을 썼지? 어차피 매판 테스트마다 초기화 되니까 이전 테스트 케이스의
 *     입력값은 이후 케이스에서 필요가 없으니까 배열을 사요해서 굳이 메모리 소모를 할 필요가 없다.
 */
public class Baekjoon2577 {

    static int[] findNum(String str) {

        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = 0;
        }

        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case '0':
                    arr[0] += 1;
                    break;
                case '1':
                    arr[1] += 1;
                    break;
                case '2':
                    arr[2] += 1;
                    break;
                case '3':
                    arr[3] += 1;
                    break;
                case '4':
                    arr[4] += 1;
                    break;
                case '5':
                    arr[5] += 1;
                    break;
                case '6':
                    arr[6] += 1;
                    break;
                case '7':
                    arr[7] += 1;
                    break;
                case '8':
                    arr[8] += 1;
                    break;
                case '9':
                    arr[9] += 1;
                    break;
                default:
                    break;
            }
        }
        return arr;
    }

        public static void main (String[]args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            int num = 1;
            for (int i = 0; i < 3; i++) {
                num *= Integer.parseInt(br.readLine());
            }

            String abc = String.valueOf(num);

            int[] arr = findNum(abc);
            for (int i = 0; i < 10; i++) {
                bw.append(String.valueOf(arr[i])).append("\n");
            }
            bw.flush();
            bw.close();
            br.close();

        }
}
