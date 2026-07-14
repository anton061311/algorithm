package __backjoon__._2025;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *     씨발 근데 왜 배열을 썼지? 어차피 매판 테스트마다 초기화 되니까 이전 테스트 케이스의
 *     입력값은 이후 케이스에서 필요가 없으니까 배열을 사요해서 굳이 메모리 소모를 할 필요가 없다.
 *
 *     -> 문자열인지 정수인지 확인하려면 앞 글자만 따서 확인하는 방법도 ㄱㅊ을듯.
 */
public class Baekjoon28702 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = 0;

        for(int i = 3; i > 0; i--){
            String input = br.readLine();
            char c = input.charAt(0);

            if(c != 'F' && c != 'B'){
                num = Integer.parseInt(input);
                num += i;
                break;
            }
        }

        if(num % 3==0) {
            if(num % 5==0) {
                System.out.println("FizzBuzz");
            }
            else {
                System.out.println("Fizz");
            }
        }
        else{
            if(num % 5==0) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(num);
            }
        }

//        bw.flush();
//        bw.close();
        br.close();
    }
}



