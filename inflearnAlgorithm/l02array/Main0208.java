/**
 * - 그냥 등수에 대한 변수를 선언하고 크기비교로 매겨버림
 */

package myself.l02array;

import java.util.*;

public class Main0208 {

    public int[] solution(int N, int[] arr){
        int[] answer = new int[N];
        for(int i = 0; i < N; i++){
            int tmp = 1;
            for(int j = 0; j < N; j++){
                if(arr[j] > arr[i]) tmp++;
            }
            answer[i] = tmp;
        }
        return answer;
    }

    public static void main(String[] args){
        Main0208 T = new Main0208();
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = kb.nextInt();
        }
        for(int x : T.solution(N, arr)){
            System.out.print(x + " ");
        }
    }
}
