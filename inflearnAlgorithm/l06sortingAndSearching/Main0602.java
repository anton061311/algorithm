/**
 * - 버블 정렬: 인접한 두 수를 비교 후 판단 기준에 따라 바꿈
 */
package myself.l06sortingAndSearching;

import java.util.*;

public class Main0602 {

    public int[] solution(int N, int[] arr){
        for (int i = 0; i < N-1; i++) {
            for (int j = 0; j < N-i-1; j++) {
                if(arr[j] > arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args){
        Main0602 T = new Main0602();
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) arr[i] = kb.nextInt();
        for(int x : T.solution(N, arr)) System.out.print(x + " ");
    }
}
