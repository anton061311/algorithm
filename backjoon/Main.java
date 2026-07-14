package __backjoon__;

import java.io.*;
import java.util.*;

// 1766 문제집
// 1759 암호 만들기
// 14888 연산자 끼워넣기

// 14728 벼락치기
// 12865 평범한 배낭
// 2293 동전1
// 2294 동전2
// 1904 01타일
// 11051 이항계수 2
//입문
//2178 미로탐색
//→ 지금 문제
//
//중급
//7576 토마토
//14940 쉬운 최단거리
//
//중상
//2206 벽부수기
//
//        상
//1600 말이 되고픈 원숭이


public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");


        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());

        int min = 0;
        int max = Arrays.stream(arr).max().getAsInt();
        while(min <= max){

            int mid = (min + max) / 2;
            long sum = 0;
            for (int tree : arr) {
                if(tree > mid){
                    sum += tree - mid;
                }
            }

            if(sum < M) max = mid - 1;
            else {
                min = mid + 1;
            }
        }

        System.out.println(min - 1);
    }
}