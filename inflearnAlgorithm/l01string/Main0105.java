/**
 * sol 1) continue 사용
 *
 * sol 2) Character 클래스의 isAlphabetic 메서드 사용
 */

import java.util.*;

public class Main0105 {

    public String solution(String str){
        String answer;
        char[] s = str.toCharArray();
        int leftT = 0, rightT = str.length() - 1;

        while(leftT < rightT){

// = = = = = = = = = = = = = = = = = sol 1 = = = = = = = = = = = = = = = = = =
            if (!((s[leftT] >= 'A' && s[leftT] <= 'Z') || (s[leftT] >= 'a' && s[leftT] <= 'z'))) {
                leftT++;
                continue;
            }
            if (!((s[rightT] >= 'A' && s[rightT] <= 'Z') || (s[rightT] >= 'a' && s[rightT] <= 'z'))) {
                rightT--;
                continue;
            }

            char tmp = s[leftT];
            s[leftT] = s[rightT];
            s[rightT] = tmp;

            leftT++;
            rightT--;
// = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =

// = = = = = = = = = = = = = = = = = sol 2 = = = = = = = = = = = = = = = = = =
//            if(!Character.isAlphabetic(s[leftT])) leftT++;
//            else if (!Character.isAlphabetic(s[rightT])) rightT--;
//            else{
//                char tmp = s[leftT];
//                s[leftT] = s[rightT];
//                s[rightT] = tmp;
//
//                leftT++;
//                rightT--;
//            }
// = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
        }
        answer = String.valueOf(s);

        return answer;
    }

    public static void main(String[] args){
        Main0105 T = new Main0105();
        Scanner kb = new Scanner(System.in);
        String input = kb.nextLine();
        System.out.println(T.solution(input));
    }
}
