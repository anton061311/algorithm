/**
 */
package myself.l06sortingAndSearching;

import java.util.*;

public class Main0608 {

    public int solution(int N, int M, int[] arr){
        int answer = 0;
        Arrays.sort(arr);
        int lt = 0, rt = N-1;
        while(lt <= rt){
            int mid = (lt + rt) / 2;
            if(arr[mid] == M){
                answer = mid + 1;
                break;
            }
            if(arr[mid] > M) rt = mid - 1;
            else lt = mid + 1;
        }

        return answer;
    }

    public static void main(String[] args){
        Main0608 T = new Main0608();
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        int M = kb.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) arr[i] = kb.nextInt();
        System.out.print(T.solution(N,M, arr));
    }
}
