package __backjoon__._2025;

import java.util.Scanner;

public class Baekjoon1546 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int N = scanner.nextInt();
            double[] score = new double[N];

            int M = 0;
            for(int i = 0; i < N; i++){
                score[i] = scanner.nextInt();
                if(score[i] > M){
                    M = (int)score[i];
                }
            }

            double sum = 0;
            for(int i = 0; i < N; i++){
                sum += score[i] / M * 100;
            }

            System.out.printf("%.2f",sum/N);
        }

}
