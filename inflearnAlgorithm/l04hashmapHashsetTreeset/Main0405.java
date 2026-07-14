/**
 * - Set은 중복 정리를 하는 자료구조
 * - 내림차순, 오름차순으로 정리를 하려면 Set 중에서 TreeSet을 사용하면 된다.
 * - 정렬이 필요한 Map을 만드려면 TreeMap이 있다. 이는 이진트리(Red Black)트리로, 무언가를
 *   찾으려면 O(logN)임.
 *  TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());
 *  -> TreeSet은 기본적으로 오름차순 정렬이나,
 *      Collections.reverseOrder() 하면 TreeSet을 내림차룬으로 정렬
 * - Tset.add()
 * - Tset.remove()
 * - Tset.size()
 * - Tset.first()
 * - Tset.last()
 */
package myself.l04hashmapHashsetTreeset;
import java.util.*;

public class Main0405 {

    public int solution(int N, int K, int[] arr){
        int answer = -1;
        TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());
        for(int i = 0; i < N; i++){
            for (int j = i+1; j < N; j++) {
                for (int l = j+1; l < N; l++) {
                    Tset.add(arr[i] + arr[j] + arr[l]);
                }
            }
        }
        int cnt = 0;
        for(int x : Tset){
            cnt++;
            if(cnt==K) return x;
        }
        return answer;

    }

    public static void main(String[] args){
        Main0405 T = new Main0405();
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        int K = kb.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i < N; i++) {
            arr[i] = kb.nextInt();
        }
        System.out.print(T.solution(N, K, arr));
    }
}
