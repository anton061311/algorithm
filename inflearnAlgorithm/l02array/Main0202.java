/**
 */
package myself.l02array;

import java.util.*;

public class Main0202 {

    public int solution(int n , int[] arr){
        int answer = 0;
        int max = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] > max){
                answer++;
                max = arr[i];
            }
        }
        return answer;
    }


    public static void main(String[] args){
        Main0202 T = new Main0202();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = kb.nextInt();
        }
        System.out.print(T.solution(n,arr));
    }
}
