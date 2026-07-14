/**
 * - 로직을 머리로 ㅈ 잡고 생각했다면 풀 수 있었을 수도
 */
package myself.l05stackQueue;

import java.util.*;

public class Main0503 {

    public int solution(int[][] board, int[] moves){
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for(int i : moves){
            int height = 0;
            while(height < board.length){
                if(board[height][i-1] != 0) {
                    int tmp = board[height][i-1];
                    board[height][i-1] = 0;
                    if(stack.isEmpty()){
                        stack.push(tmp);
                        break;
                    }
                    else if(tmp == stack.peek()) {
                        stack.pop();
                        answer += 2;
                        break;
                    }else{
                        stack.push(tmp);
                        break;
                    }
                }
                height++;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Main0503 T = new Main0503();
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        int[][] board = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                board[i][j] = kb.nextInt();
            }
        }
        int M = kb.nextInt();
        int[] moves = new int[M];
        for (int i = 0; i < M; i++) moves[i] = kb.nextInt();
        System.out.print(T.solution(board, moves));
    }
}
