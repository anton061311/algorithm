/**
 * !! - K를 직접 건드는 방법 보다 기회 사용 횟수 변수인 count를 설정하는 것이
 *      안정성과 가독성 면에서 더 나은 풀이이다.
 */
package myself.l03towpointersSlidingwindow;


import java.util.*;

public class Main0306 {

    public int solution(int N, int K, int[] arr){
        int answer = 0;
        int left = 0;
        int count = 0;
        for (int right = 0; right < N; right++){
            if(arr[right] == 0) count++;
            while(count > K){
                if(arr[left] == 0) count--;
                left++;
            }
            answer = Math.max(answer, right - left + 1);
        }
        return answer;
    }

    public static void main(String[] args){
        Main0306 T = new Main0306();
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        int K = kb.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = kb.nextInt();
        }
        System.out.print(T.solution(N, K, arr));
    }
}
