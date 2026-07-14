/**
 */
package myself.l05stackQueue;

import java.util.*;

public class Main0507 {

    public String solution(String require, String plan){
        String answer = "YES";
        Queue<Character> queue = new LinkedList<>();

        for(char x : require.toCharArray()) queue.offer(x);
        for(char x : plan.toCharArray()){
            if(queue.contains(x)){
                if(x != queue.poll()) return "NO";
            }
        }
        if(!queue.isEmpty()) return "NO";
        return answer;
    }

    public static void main(String[] args){
        Main0507 T = new Main0507();
        Scanner kb = new Scanner(System.in);
        String require = kb.next();
        String plan = kb.next();
        System.out.print(T.solution(require, plan));
    }
}
