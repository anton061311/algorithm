/**
 * ! - 입체로 생각했다면 더 나은 접근이 되었을 문제.
 */
package myself.l05stackQueue;

import java.util.*;

public class Main0505 {

    public int solution(String str){
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '(') stack.push('(');
            else{
                stack.pop();
                if(str.charAt(i-1) == '(') answer += stack.size();
                else answer++;
            }
        }

//        char tmp = ')';
//        for(char x : str.toCharArray()){
//            if(x == '(') stack.push(x);
//            else{
//                stack.pop();
//                if(tmp == '(') answer += stack.size();
//                else answer++;
//            }
//            tmp = x;
//        }



        return answer;
    }

    public static void main(String[] args){
        Main0505 T = new Main0505();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.print(T.solution(str));
    }
}
