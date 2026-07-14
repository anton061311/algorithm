package myself.l01string;

/**
 * sol 1) indexOf(?) == -1
 *
 * sol 2)
 */

import java.util.*;

public class Main0107 {

    public String solution(String str){
        String answer = "YES";
        boolean isSymmetry = true;

        char[] c = str.toUpperCase().toCharArray();

        for(int i = 0; i < str.length()/2; i++){
            if(c[i] != c[str.length()-i-1]){
                isSymmetry = false;
                break;
            }
        }

        if(!isSymmetry) answer = "NO";

        return answer;
    }

    public static void main(String[] args){
        Main0107 T = new Main0107();
        Scanner kb = new Scanner(System.in);
        String input = kb.nextLine();
        System.out.println(T.solution(input));
    }
}
