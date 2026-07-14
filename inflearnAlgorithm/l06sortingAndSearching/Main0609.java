/**
 * ! - Arrays.stream 에 대해 알게 됨.
 *   - for문으로 배열ㄷ ㅓ하지 말고 stream.sum 사용하는 것이 좋을듯
 *   - 최댓값과 최솟값은 합의 몫으로 계산하려고 했으나 two pointers를 이용해서 푸는 것이 나음.
 *
 * lt(9) -------------- rt(45)
 * mid일 때, M장 보다 더 필요한지, 덜 필요한지?
 * M과 비교 될 정수를 반환하는 메서드를 작성하자. 중복이 되니~
 * count 함수의 파라미터는 mid, arr 이고, 내부 변수는 cnt, 도합, 리셋하는 알고리즘 구현
 */
package myself.l06sortingAndSearching;

import java.util.*;

public class Main0609 {

    public int count(int[] arr, int capacity){
        int cnt = 1;
        int sum = 0;
        for(int x : arr){
            if(sum+x > capacity){
                cnt++;
                sum = x;
            }
            else sum += x;
        }
        return cnt;
    }

    public int solution(int N, int M, int[] arr){
        int answer = 0;
        int lt = Arrays.stream(arr).max().getAsInt();
        int rt = Arrays.stream(arr).sum();
        while (lt <= rt){
            int mid = (lt+rt)/2;
            if(count(arr, mid)<= M){
                answer = mid;
                rt = mid - 1;
            }
            else lt = mid + 1;
        }


        return answer;
    }

    public static void main(String[] args){
        Main0609 T = new Main0609();
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        int M = kb.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) arr[i] = kb.nextInt();
        System.out.println(T.solution(N,M,arr));
    }
}
