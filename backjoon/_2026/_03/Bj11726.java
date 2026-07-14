package __backjoon__._2026._03;

import java.util.*;
import java.io.*;

public class Bj11726 {


    public static void main (String[] args) /*throws IOException*/{

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int N = Integer.parseInt(br.readLine());
//        StringBuilder sb = new StringBuilder();

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] dy = new int[Math.max(N + 1, 3)];
        dy[1] = 1;
        dy[2] = 2;

        for (int i = 3; i <= N; i++){
            dy[i] = (dy[i - 1] + dy[i - 2]) % 10007;
        }

        System.out.println(dy[N]);

    }
}
