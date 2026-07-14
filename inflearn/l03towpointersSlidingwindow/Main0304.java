package myself.l03towpointersSlidingwindow;

/**
 * sol) two point 사용하기. 그리고 직관적으로 생각해 보면 당연한 결과였음.
 */

import java.util.*;

public class Main0304 {

    public int solution(int N, int M, int[] arr){
        int answer = 0;
        int sum = 0;
        int start = 0;

        for (int end = 0; end < N; end++) {
            sum += arr[end];

            while(sum > M) sum -= arr[start++];

            if(sum == M) answer++;
        }

        return answer;
    }

    public static void main(String[] args){
        Main0304 T = new Main0304();
        Scanner kb = new Scanner(System.in);

        int N = kb.nextInt();
        int M = kb.nextInt();

        int [] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = kb.nextInt();
        }

        System.out.println(T.solution(N, M, arr));
    }
}
