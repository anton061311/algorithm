/**
 */
package myself.l02array;

import java.util.*;

public class Main0209 {

    public int solution(int N, int[][] arr){
        int answer = 0;

        for (int i = 0; i < N; i++) {
            int rowSum = 0;
            int colSum = 0;
            for (int j = 0; j < N; j++) {
                rowSum += arr[i][j];
                colSum += arr[j][i];
            }
            answer = Math.max(answer, rowSum);
            answer = Math.max(answer, colSum);
        }

        int diag1 = 0;
        int diag2 = 0;
        for(int i = 0; i < N; i++){
            diag1 += arr[i][i];
            diag2 += arr[i][N-i-1];
        }
        answer = Math.max(answer, diag1);
        answer = Math.max(answer, diag2);

        return answer;
    }

    public static void main(String[] args){
        Main0209 T = new Main0209();
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        int[][] arr = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = kb.nextInt();
            }
        }
        System.out.println(T.solution(N, arr));
    }
}
