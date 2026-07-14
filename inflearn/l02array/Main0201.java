/**
 * sol 1) Integer.parseInt(tmp,2); -> 2진수로 바꿔줌
 * sol 2) (char)num -> 아스키 코드인 num을 문자로
 *
 */
package myself.l02array;

import java.util.*;

public class Main0201 {

    public ArrayList<Integer> solution(int n , int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);
        for(int i = 1; i < n; i++){
            if(arr[i] > arr[i-1]){
                answer.add(arr[i]);
            }
        }

        return answer;
    }


    public static void main(String[] args){
        Main0201 T = new Main0201();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = kb.nextInt();
        }
        for(int x : T.solution(n,arr)){
            System.out.print(x + " ");
        }
    }
}
