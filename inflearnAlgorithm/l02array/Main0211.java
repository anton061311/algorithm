/**
 */
package myself.l02array;

import java.util.*;

public class Main0211 {

    public int solution(int N, int[][] arr){
        int answer = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < N; i++) {
            int cnt = 0;
            for (int j = 0; j < N; j++) {
                if(i == j) continue;
                for (int k = 0; k < 5; k++) {
                    if (arr[i][k] == arr[j][k]) {
                        cnt++;
                        break;
                    }
                }
            }
            if (cnt > max) {
                max = cnt;
                answer = i;
            }
        }
        return answer+1;
    }

    public static void main(String[] args){
        Main0211 T = new Main0211();
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        int[][] arr = new int[N][5];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = kb.nextInt();
            }
        }
        System.out.println(T.solution(N, arr));
    }
}

