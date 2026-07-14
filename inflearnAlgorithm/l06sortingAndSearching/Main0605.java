/**
 */
package myself.l06sortingAndSearching;

import java.util.*;

public class Main0605 {

    public char solution(int N, int[] arr){
        for(int i = 0; i < N; i++){
            for(int j = i+1; j < N; j++){
                if(arr[i] == arr[j]){
                    return 'D';
                }
            }
        }
        return 'U';
    }

    public static void main(String[] args){
        Main0605 T = new Main0605();
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) arr[i] = kb.nextInt();
        System.out.print(T.solution(N, arr));
    }
}
