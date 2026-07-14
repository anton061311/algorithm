package myself.l01string;

/**
 * sol 1) Integer.parseInt(tmp,2); -> 2진수로 바꿔줌
 * sol 2) (char)num -> 아스키 코드인 num을 문자로
 *
 */

import java.util.*;

public class Main0112 {

    public String solution(int n, String s){
        String answer = "";

        for(int i = 0; i < n; i++){
            String tmp = s.substring(0,7).replace('#', '1').replace('*', '0');
            int num = Integer.parseInt(tmp, 2);
            answer += (char)num;
            s = s.substring(7);
        }

        return answer;
    }

    public static void main(String[] args){
        Main0112 T = new Main0112();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String str = kb.next();

        System.out.println(T.solution(n, str));
    }
}
