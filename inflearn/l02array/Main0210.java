package myself.l02array;

/**
 * - 해당 데이터 * 4 > 상하좌우 합 -> summit
 */

import java.util.*;

public class Main0210 {

    public int solution(int N, int[][] arr){
        int answer = 0;

        for(int i = 1; i < N+1; i++){
            for (int j = 1; j < N+1; j++) {
                if(arr[i][j] <= arr[i-1][j]) continue;
                if(arr[i][j] <= arr[i+1][j]) continue;
                if(arr[i][j] <= arr[i][j-1]) continue;
                if(arr[i][j] <= arr[i][j+1]) continue;
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args){
        Main0210 T = new Main0210();
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        int[][] arr = new int[N+2][N+2];

        for(int i = 0; i < N+2; i++){
            arr[i][0] = arr[0][i] = arr[N+1][i] = arr[i][N+1] = 0;
        }

        for (int i = 1; i < N+1; i++) {
            for (int j = 1; j < N+1; j++) {
                arr[i][j] = kb.nextInt();
            }
        }
        System.out.println(T.solution(N, arr));
    }
}
