package __backjoon__._2025;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 *     씨발 근데 왜 배열을 썼지? 어차피 매판 테스트마다 초기화 되니까 이전 테스트 케이스의
 *     입력값은 이후 케이스에서 필요가 없으니까 배열을 사요해서 굳이 메모리 소모를 할 필요가 없다.
 */
public class Baekjoon3052 {

        public static void main (String[]args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int count = 0;
            int[] arr = new int[10];
            for(int i = 0; i < 10; i++){
                int inputNum = Integer.parseInt(br.readLine());
                arr[i] = inputNum % 42;
            }
            Arrays.sort(arr);
            for(int i = 0; i < arr.length - 1; i++){
                if(arr[i] != arr[i + 1]){
                    count++;
                }
            }

            System.out.println(count + 1);
            br.close();


        }
}
