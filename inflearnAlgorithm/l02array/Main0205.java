/**
 * ! - 막상 손 대면 뇌정지 옴
 */
package myself.l02array;

import java.util.*;

public class Main0205 {

    public int solution(int N){
        int answer = 0;
        int[] primeNum = new int[N+1];
        for (int i = 2; i <= N; i++) {
            if(primeNum[i] == 0){
                answer++;
                for (int j = i; j <= N; j = j + i) {
                    primeNum[j] = 1;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Main0205 T = new Main0205();
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        System.out.println(T.solution(N));
    }
}
