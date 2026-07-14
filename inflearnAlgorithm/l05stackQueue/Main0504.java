/**
 * - 0의 ASCII CODE는 48임
 */
package myself.l05stackQueue;

import java.util.*;

public class Main0504 {

    public int solution(String str){
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for(char x : str.toCharArray()){
            if(Character.isDigit(x)) stack.push(x-48); // 아스키 값에서 0의 아스키 코드 값 빼는 잡기술
            else{
                int rt = stack.pop();
                int lt = stack.pop();
                if(x == '+') stack.push(lt+rt);
                else if (x == '-') stack.push(lt - rt);
                else if (x == '*') stack.push(lt * rt);
                else if (x == '/') stack.push(lt / rt);
            }
        }
        answer = stack.peek();

        return answer;
    }

    public static void main(String[] args){
        Main0504 T = new Main0504();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.print(T.solution(str));
    }
}
