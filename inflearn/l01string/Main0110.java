package myself.l01string;

/**
 * sol 1)
 *
 * sol 2)
 *
 */

import java.util.*;

public class Main0110 {

    public int[] solution(String s, char t){
        int[] answer = new int[s.length()];
        int p = 100;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == t){
                p = 0;
                answer[i] = p;
            }else {
                p++;
                answer[i] = p;
            }
        }

        p = 100;
        for(int i = s.length() - 1; i >= 0; i--){
            if(s.charAt(i) == t){
                p = 0;
            }else {
                p++;
                answer[i] = Math.min(answer[i], p);
            }
        }

        return answer;
    }

    public static void main(String[] args){
        Main0110 T = new Main0110();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char t = kb.next().charAt(0);

        for(int x : T.solution(str, t)){
            System.out.print(x + " ");
        }
    }
}
