package __backjoon__._2025;

import java.util.Scanner;

public class Baekjoon2839 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int bag = 0;
            while(true){
                if(n % 5 == 0){
                    System.out.println(n / 5 + bag);
                    break;
                }
                else if(n <=0){
                    System.out.println(-1);
                    break;
                }
                n -= 3;
                bag++;
            }
        scanner.close();
    }
}


