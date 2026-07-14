package __backjoon__._2025;

import java.util.Scanner;

public class Baekjoon11050 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int K = scanner.nextInt();

        System.out.println(factorial(N)/factorial(K)/factorial(N-K));

    }
    static long factorial(int n){
        if(n <= 1) return 1;
        return n * factorial(n - 1);
    }
}
