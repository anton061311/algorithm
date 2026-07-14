/**
 * - sliding window에 대한 체화 부족
 * - two pointer에 대한 체화 부족
 * - HashMap을 Integer, Integer 쌍으로 선언할 생각 못함.
 */
package myself.l04hashmapHashsetTreeset;


import java.util.*;

public class Main0403 {

    public ArrayList<Integer> solution(int N, int K, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < K-1; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        int lt = 0;
        for(int rt = K - 1; rt < N; rt++){
            map.put(arr[rt], map.getOrDefault(arr[rt], 0) + 1);
            answer.add(map.size());
            map.put(arr[lt], map.get(arr[lt]) - 1);
            if(map.get(arr[lt]) == 0) map.remove(arr[lt]);
            lt++;
        }

        return answer;
    }

    public static void main(String[] args){
        Main0403 T = new Main0403();
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        int K = kb.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = kb.nextInt();
        }
        for(int x : T.solution(N, K, arr)) System.out.print(x + " ");
    }
}
