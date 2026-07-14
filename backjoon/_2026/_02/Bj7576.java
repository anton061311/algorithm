package __backjoon__._2026._02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Bj7576 {
}


///**
// * 백준 7576번
// *
// */
//package __backjoon__;
//
//import java.io.*;
//        import java.util.*;
//
//public class Main {
//
//    static int N, M, result;
//    static int[] dx = {1, -1, 0, 0}, dy = {0, 0, 1, -1};
//    static int[][] box;
//    static boolean[][] visited;
//    static Queue<int[]> queue = new LinkedList<>();
//
//    private static int bfs() {
//        while(!queue.isEmpty()){
//            int[] tmp = queue.poll();
//            int x = tmp[0];
//            int y = tmp[1];
//
//            for (int i = 0; i < 4; i++) {
//                int nx = x + dx[i];
//                int ny = y + dy[i];
//
//                if(nx >= 0 && ny >= 0 && nx < N && ny < M){
//                    if(box[nx][ny] == 0){
//                        queue.add(new int[]{nx, ny});
//                        box[nx][ny] = box[x][y] + 1;
//                    }
//                }
//            }
//        }
//
//        for (int i = 0; i < N; i++) {
//            for (int j = 0; j < M; j++) {
//                if(box[i][j] == 0){
//                    return -1;
//                }
//                result = Math.max(result, box[i][j]);
//            }
//        }
//
//        if (result == 1){
//            return 0;
//        }else{
//            return result - 1;
//        }
//    }
//
//    public static void main(String[] args) throws Exception{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//
//        N = Integer.parseInt(st.nextToken());
//        M = Integer.parseInt(st.nextToken());
//
//        box = new int[N][M];
//        for (int i = 0; i < N; i++) {
//            st = new StringTokenizer(br.readLine(), " ");
//            for (int j = 0; j < M; j++) {
//                box[i][j] = Integer.parseInt(st.nextToken());
//                if (box[i][j] == 1){
//                    queue.add(new int[]{i,j });
//                }
//            }
//        }
//        System.out.println(bfs());
//    }
//}
