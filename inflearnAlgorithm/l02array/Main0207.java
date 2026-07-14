package myself.l02array;

import java.util.*;

public class Main0207 {

    public int solution(int N, int[] arr){
        int answer = 0;
        int score = 1;

        for(int i = 0; i < N; i++){
            if(arr[i] == 1){
                answer += score;
                score++;
            }
            else {
                score = 1;
            }

        }
        return answer;
    }

    public static void main(String[] args){
        Main0207 T = new Main0207();
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = kb.nextInt();
        }
        System.out.print(T.solution(N, arr));
    }
}
