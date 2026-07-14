/**
 * 밀리는 정렬
 */
package myself.l06sortingAndSearching;

import java.util.*;

public class Main0603 {

    public int[] solution(int N, int[] arr){
        for (int i = 1; i < N; i++) {
            int tmp = arr[i] , j;
            for (j = i-1; j >= 0; j--) {
                if(arr[j] > tmp) arr[j+1] = arr[j];
                else break;
            }
            arr[j+1] = tmp;
        }
        return arr;
    }

    public static void main(String[] args){
        Main0603 T = new Main0603();
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) arr[i] = kb.nextInt();
        for(int x : T.solution(N, arr)) System.out.print(x + " ");
    }
}
