package myself.l08advanceDFSBFS;

import java.io.*;
import java.util.*;

public class Main0813 {

    static int N, answer;
    static int[][] map;
    static int[] dx = {1, 1, 0, -1, -1, -1, 0, 1};
    static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};

    void dfs(int x, int y){
        for (int i = 0; i < 8; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx >= 0 && nx < N && ny >= 0 && ny < N && map[nx][ny] == 1){
                map[nx][ny] = 0;
                dfs(nx, ny);
            }
        }
    }

    public static void main (String[] args) throws Exception{
        Main0813 T = new Main0813();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        map = new int[N][N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }


        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(map[i][j] == 1){
                    answer++;
                    map[i][j] = 0;
                    T.dfs(i,j);
                }
            }
        }

        System.out.println(answer);

    }

}

