package myself.l01string;

/**
 * sol 1) indexOf(?) == -1
 *
 * sol 2)
 */

import java.util.*;

public class Main0106 {

    public String solution(String str){
        String answer = "";

        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(answer.indexOf(c) == -1){
                answer += c;
            }
        }

        return answer;
    }

    public static void main(String[] args){
        Main0106 T = new Main0106();
        Scanner kb = new Scanner(System.in);
        String input = kb.nextLine();
        System.out.println(T.solution(input));
    }
}
