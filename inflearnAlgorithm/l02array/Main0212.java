/**
 */
package myself.l02array;

import java.util.*;

public class Main0212 {

    public int solution(int N, int M, int[][] arr){
        int answer = 0;
        for(int a = 1; a <= N; a++) {
            for (int b = 1; b <= N; b++) {
                if(a == b) continue;
                boolean isMentor = true;

                for (int t = 0; t < M; t++) {
                    int posA = 0, posB = 0;
                    for (int rank = 0; rank < N; rank++) {
                        if (arr[t][rank] == a) posA = rank;
                        if (arr[t][rank] == b) posB = rank;
                    }

                    if(posA > posB) {
                        isMentor = false;
                        break;
                    }
                }
                if(isMentor) answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Main0212 T = new Main0212();
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        int M = kb.nextInt();
        int[][] arr = new int[M][N];

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = kb.nextInt();
            }
        }
        System.out.println(T.solution(N, M, arr));
    }
}
