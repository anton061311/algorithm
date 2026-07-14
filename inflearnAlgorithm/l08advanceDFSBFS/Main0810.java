package myself.l08advanceDFSBFS;

import java.util.*;

public class Main0810 {

    static int[][] board = new int[8][8];
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,-1,0,1};
    static int answer;

    void dfs(int x, int y){
        if(x == 7 && y == 7){
            answer++;
            return;
        }else{
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if(nx >= 1 && nx <=7 && ny >= 1 && ny <= 7 && board[nx][ny] == 0){
                    board[nx][ny] = 1;
                    dfs(nx,ny);
                    board[nx][ny] = 0;
                }
            }
        }
    }

    public static void main (String[] args) {

        Main0810 T = new Main0810();
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i < 8; i++) {
            for (int j = 1; j < 8; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        board[1][1] = 1;
        T.dfs(1,1);
        System.out.println(answer);

    }
}
