package __backjoon__._2025;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 */
public class Baekjoon_Tlqkf {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] nm = br.readLine().split(" ");

        int N = Integer.parseInt(nm[0]);
        int M = Integer.parseInt(nm[1]);

        String[] board = new String[N];
        for(int i = 0; i < N; i++){
            board[i] = br.readLine();
        }
        br.close();


        int minRepaint = Integer.MAX_VALUE;// 왜?

        for(int i = 0; i <= N - 8; i++){
            for(int j = 9; j <= M - 8; j++){
                int countPattern1 = 0; // 좌상W
                int countPattern2 = 0; // 좌상B

                for(int row = 0; row < 8; row++){
                    for(int col = 0; col < 8; col++){
                        char current = board[i + row].charAt(j + col);

                        // 패턴 1: (row+col) 짝수일 때 'W', 홀수일 떄 'B'
                        if((row+col) % 2 == 0){
                            if(current != 'W') countPattern1++;
                        }else{
                            if(current != 'B') countPattern1++;
                        }
                        // 패턴 2: (row+col)가 짝수일 때 'B', 홀수일 떄 'B'
                        if((row + col) % 2 == 0){
                            if(current != 'B') countPattern2++;
                        } else {
                            if(current != 'W') countPattern2++;
                        }
                    }
                }
                int currentMain = Math.min(countPattern1, countPattern2);
                minRepaint = Math.min(minRepaint, currentMain);
            }
        }
        System.out.println(minRepaint);

    }

}
