/**
 */
package myself.l03towpointersSlidingwindow;

import java.util.*;

public class Main0302 {
    public ArrayList<Long> solution(int N, int M, long[] arr1, long[] arr2){
        ArrayList<Long> answer = new ArrayList<>();
        int p1 = 0, p2 = 0;
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        while(p1 < N && p2 < M){
            if(arr1[p1] == arr2[p2]){
                answer.add(arr1[p1]);
                p1++;
                p2++;
            }
            else if(arr1[p1] < arr2[p2]) p1++;
            else p2++;
        }

// 무식한 방법
//        for (int i = 0; i < N; i++) {
//            for (int j = 0; j < M; j++) {
//                if(arr1[i] == arr2[j]) answer.add(arr1[i]);
//            }
//        }
        return answer;
    }

    public static void main(String[] args){
        Main0302 T = new Main0302();
        Scanner kb = new Scanner(System.in);

        int N = kb.nextInt();
        long [] arr1 = new long[N];
        for (int i = 0; i < N; i++) {
            arr1[i] = kb.nextInt();
        }

        int M = kb.nextInt();
        long[] arr2 = new long[M];
        for (int i = 0; i < M; i++) {
            arr2[i] = kb.nextInt();
        }

        for(long x : T.solution(N, M, arr1, arr2)) System.out.print(x + " ");
    }
}
