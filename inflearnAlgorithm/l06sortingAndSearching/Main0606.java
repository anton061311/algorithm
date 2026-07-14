/**
 * ? - int[] tmp = arr. clone(); // arr를 tmp에 복사함
 * ! - 그냥 다른 하나의 배열을 복제한 다음 비교하면 더 쉬웠던 문제
 */
package myself.l06sortingAndSearching;

import java.util.*;

public class Main0606 {

    public ArrayList<Integer> solution(int N, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        int[] tmp = arr.clone();
        Arrays.sort(tmp);
        for(int i = 0; i < N; i++){
            if(tmp[i] != arr[i]) answer.add(i+1);
        }
        return answer;
    }

    public static void main(String[] args){
        Main0606 T = new Main0606();
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) arr[i] = kb.nextInt();
        for(int x : T.solution(N, arr)) System.out.print(x + " ");
    }
}
