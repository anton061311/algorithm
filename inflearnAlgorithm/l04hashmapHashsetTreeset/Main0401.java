/**
 * - HashMap은 key와 value쌍으로 이루어 진다. 각각 자료형 지정 가능.
 * - getOrDefault( 인자1, 인자2 ): 값이 있다면 인자1 반환 없다면 두 번째 인자를 반환하는 메서드
 * - map.containsKey('A'): 변수 map에 A가 존재하면 true, 아니면 false를 반환하는 메서드.
 * - map.size(): key의 갯수를 알려주는 메서드
 * - map.remove('A'): A라는 key를 삭제하는 메서드
 */
package myself.l04hashmapHashsetTreeset;


import java.util.*;

public class Main0401 {

    public char solution(int N, String str){
        char answer = ' ';
        HashMap<Character, Integer> map = new HashMap<>();
        for(char x : str.toCharArray()){
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        int max = Integer.MIN_VALUE;
        for(char key : map.keySet()){
            if(map.get(key) > max){
                max = map.get(key);
                answer = key;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Main0401 T = new Main0401();
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        String str = kb.next();
        System.out.print(T.solution(N, str));
    }
}
