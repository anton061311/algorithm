/**
 * - sum 앞에 하나 뺴고, 뒤에 하나 더하기.
 */

package myself.l03towpointersSlidingwindow;

import java.util.*;

public class Main0303 {

    public int solution(int N, int K, int[] arr){
        int answer = 0;

        for (int i = 0; i < K; i++) answer += arr[i];
        int sum = answer;

        for(int i = 0; i < N-2; i++){
            sum = sum + arr[K+i-1] - arr[i];
            answer = Math.max(sum, answer);
        }
        return answer;
    }

    public static void main(String[] args){
        Main0303 T = new Main0303();
        Scanner kb = new Scanner(System.in);

        int N = kb.nextInt();
        int K = kb.nextInt();

        int [] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = kb.nextInt();
        }

        System.out.println(T.solution(N, K, arr));
    }
}
