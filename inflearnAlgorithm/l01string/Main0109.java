package myself.l01string;

/**
 * sol 1)
 *
 * sol 2)
 *
 */

import java.util.*;

public class Main0109 {

    public int solution(String str){
        str = str.toUpperCase().replaceAll("[^0-9]","");
        int answer = Integer.parseInt(str);
        return answer;
    }

    public static void main(String[] args){
        Main0109 T = new Main0109();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(T.solution(input));
    }
}
