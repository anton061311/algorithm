/**
 * ! - Cache Miss 와 Cache Hit 케이스 분류를 했어야 함.
 * ! - 하나씩 복붙을 구현할 생각을 멍청한 생각이라고 치부함.
 */
package myself.l06sortingAndSearching;

import java.util.*;

public class Main0604 {

    public int[] solution(int S, int N, int[] arr){
        int[] cache = new int[S];
        for (int x : arr){
            int pos = -1;
            for(int i = 0; i < S; i++){
                if(x == cache[i]){
                    pos = i;
                }
            }
            // Cache Miss
            if(pos == -1){
                for(int i = S-1; i >= 1; i--){
                    cache[i] = cache[i-1];
                }
            }
            // Cache Hit
            else{
                for(int i = pos; i >= 1; i--){
                    cache[i] = cache[i-1];
                }
            }
            cache[0] = x;
        }
        return cache;
    }

    public static void main(String[] args){
        Main0604 T = new Main0604();
        Scanner kb = new Scanner(System.in);
        int S = kb.nextInt();
        int N = kb.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) arr[i] = kb.nextInt();
        for(int x : T.solution(S, N, arr)) System.out.print(x + " ");
    }
}

