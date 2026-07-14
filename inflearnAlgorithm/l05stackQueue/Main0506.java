/**
 * - queue.offer(x)
 * - queue.poll()
 * - queue.peek()
 * - queue.isEmpty(x)
 * - queue.size()
 * - queue.contains(x)
 */
package myself.l05stackQueue;

import java.util.*;

public class Main0506 {

    public int solution(int N, int K){
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 1; i <= N; i++) queue.offer(i);
        while(!queue.isEmpty()){
            for (int i = 1; i < K; i++) queue.offer(queue.poll());
            queue.poll();
            if(queue.size() == 1) answer = queue.poll();
        }
        return answer;
    }

    public static void main(String[] args){
        Main0506 T = new Main0506();
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        int K = kb.nextInt();
        System.out.print(T.solution(N, K));
    }
}
