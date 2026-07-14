package __backjoon__._2026._02;

import java.io.*;
import java.util.*;

public class Bj1012 {

    static boolean[][] visited;
    static int[][] graph;
    static int M, N; // M: 가로(열), N: 세로(행)

    static int[] dx = {-1, 1, 0, 0};  // 좌 우 상 하 (x 변화)
    static int[] dy = {0, 0, -1, 1};  // y 변화

    static void bfs(int x, int y) {
        visited[y][x] = true;
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{x, y});

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int cx = cur[0], cy = cur[1];

            for (int i = 0; i < 4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                if (nx < 0 || nx >= M || ny < 0 || ny >= N) continue;
                if (graph[ny][nx] == 1 && !visited[ny][nx]) {
                    visited[ny][nx] = true;
                    q.offer(new int[]{nx, ny});
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine().trim());

        for (int t = 0; t < T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken()); // 가로
            N = Integer.parseInt(st.nextToken()); // 세로
            int K = Integer.parseInt(st.nextToken());

            graph = new int[N][M];
            visited = new boolean[N][M];

            ArrayList<int[]> list = new ArrayList<>(K);

            for (int i = 0; i < K; i++) {
                st = new StringTokenizer(br.readLine());
                int X = Integer.parseInt(st.nextToken());
                int Y = Integer.parseInt(st.nextToken());

                graph[Y][X] = 1;        // 핵심: [y][x]
                list.add(new int[]{X, Y});
            }

            int answer = 0;
            for (int[] p : list) {
                int x = p[0], y = p[1];
                if (!visited[y][x]) {    // 핵심: [y][x]
                    bfs(x, y);
                    answer++;
                }
            }

            sb.append(answer).append('\n');
        }

        System.out.print(sb);
    }
}
