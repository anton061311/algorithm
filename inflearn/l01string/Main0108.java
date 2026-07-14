package myself.l01string;

/**
 * sol 1) replaceALL("이거면 (아니라면 앞에 ^추가)", "로 만들어라")
 *
 * sol 2)
 */

import java.util.*;

public class Main0108 {

    public String solution(String str){
        String answer = "YES";

        str = str.toUpperCase().replaceAll("[^A-Z]","");
        String tmp = new StringBuilder(str).reverse().toString();

        if(!str.equals(tmp)) answer = "NO";

        return answer;
    }

    public static void main(String[] args){
        Main0108 T = new Main0108();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(T.solution(input));
    }
}
