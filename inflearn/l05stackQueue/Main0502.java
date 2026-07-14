/**
 */
package myself.l05stackQueue;

import java.util.*;

public class Main0502 {

    public String solution (String str){
        String answer = "";
        Stack<Character> stack = new Stack<>();
        for(char x : str.toCharArray()){
            if(x == ')') while (stack.pop() != '(') ;
            else stack.push(x);
        }
        for(int i = 0; i < stack.size(); i++) answer += stack.get(i);
        return answer;
    }

    public static void main(String[] args){
        Main0502 T = new Main0502();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.print(T.solution(str));
    }
}
