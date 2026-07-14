package __backjoon__._2026._04;

import java.util.*;
import java.io.*;

public class Bj13549 {

    static final int MAX = 100000;
    static int N, K;
    static int[] dist;

    static void bfs() {
        Deque<Integer> dq = new ArrayDeque<>();
        Arrays.fill(dist, Integer.MAX_VALUE);

        dist[N] = 0;
        dq.add(N);

        while (!dq.isEmpty()) {
            int cur = dq.pollFirst();

            if (cur == K) {
                System.out.println(dist[cur]);
                return;
            }

            int next = cur * 2;
            if (next <= MAX && dist[next] > dist[cur]) {
                dist[next] = dist[cur];
                dq.addFirst(next);
            }

            next = cur - 1;
            if (next >= 0 && dist[next] > dist[cur] + 1) {
                dist[next] = dist[cur] + 1;
                dq.addLast(next);
            }

            next = cur + 1;
            if (next <= MAX && dist[next] > dist[cur] + 1) {
                dist[next] = dist[cur] + 1;
                dq.addLast(next);
            }
        }
    }

    public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        dist = new int[MAX + 1];
        bfs();
    }
}
