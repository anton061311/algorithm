/**
 * - 선택 정렬: i와 j를 정해두고 가장 작은 수의 index와 i를 바꿈.
 */
package myself.l06sortingAndSearching;

import java.util.*;

public class Main0601 {

    public int[] solution(int N, int[] arr){
        for(int i = 0; i < N-1; i++){
            int idx = i;
            for(int j = i + 1; j < N; j++){
                if(arr[j] < arr[idx]) idx = j;
            }
            int tmp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = tmp;
        }

        return arr;
    }

    public static void main(String[] args){
        Main0601 T = new Main0601();
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) arr[i] = kb.nextInt();
        for(int x : T.solution(N, arr)) System.out.println(x + " ");
    }
}
