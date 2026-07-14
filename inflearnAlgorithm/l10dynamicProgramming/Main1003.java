package myself.l10dynamicProgramming;

import java.util.*;

public class Main1003 {

    static int[] dy;

    public int solution(int[] arr){
        int answer = 0;
        dy = new int[arr.length];
        dy[0] = 1;
        answer = dy[0];
        for(int i = 1; i < arr.length; i++){

            int max = 0;
            for (int j = i; j >= 0; j--) {
                if(arr[j] < arr[i] && dy[j] > max) max = dy[j];
            }
            dy[i] = max + 1;
            answer = Math.max(answer, dy[i]);
        }
        return answer;
    }

    public static void main(String[] args) {
        Main1003 T = new Main1003();
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) arr[i] = scanner.nextInt();

        System.out.println(T.solution(arr));
    }
}
