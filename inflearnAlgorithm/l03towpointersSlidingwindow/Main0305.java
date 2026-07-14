/**
 * sol 1) two pointers
 *
 * sol 2) Math
 */
package myself.l03towpointersSlidingwindow;


import java.util.*;

public class Main0305 {

    public int solution(int N){
        int answer = 0;

        // sol 1, two pointers
        int sum = 0;
        int start = 0;
        int M = N / 2 + 1;
        int[] arr = new int[M];
        for (int i = 0; i < M; i++) arr[i] = i + 1;

        for (int end = 0; end < M; end++){
            sum += arr[end];
            if(sum == N) answer++;
            while (sum >= N){
                sum -= arr[start++];
                if(sum == N) answer++;
            }
        }

        /*
        // sol 2, Math
        int cnt = 1; //연속된 자연수의 갯수
        N--;
        while(N>0){
            cnt++;
            N = N - cnt;
            if(N % cnt == 0) answer++;
        }
        */

        return answer;
    }

    public static void main(String[] args){
        Main0305 T = new Main0305();
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        System.out.print(T.solution(N));
    }
}
