package myself.l01string;

/**
 * sol 1) reverse 를 사용해서 풀이
 *
 * sol 2) 입력을 char형 배열에 담아 swap
 */

import java.util.*;

public class Main0104 {

    public ArrayList<String> solution(int n, String[] str){
        ArrayList<String> answer = new ArrayList<>();
        for(String x : str){
//            String tmp = new StringBuilder(x).reverse().toString();
//            answer.add(tmp);

            char[] s = x.toCharArray();
            int leftT = 0;
            int rightT = s.length - 1;
            while(leftT < rightT){
                char tmp = s[leftT];
                s[leftT] = s[rightT];
                s[rightT] = tmp;
                leftT++;
                rightT--;
            }
            answer.add(String.valueOf(s));
        }

        return answer;
    }

    public static void main(String[] args){
        Main0104 T = new Main0104();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String[] str = new String[n];
        for(int i = 0; i < n; i++){
            str[i] = kb.next();
        }
        for(String x : T.solution(n, str)){
            System.out.println(x);
        }
    }
}
