package myself.l01string;

/**
 * sol 1)
 * 2. 사고 전환이 필요한 부분
 * 이 문제를 풀 때, 핵심 발상은:
 *
 * 루프의 주도권을 하나로만 두자.
 * i는 오직 하나의 루프에서만 증가해야 함.
 * (즉, for + while처럼 이중으로 i를 건드리지 말고, while을 메인 루프로 쓰거나 for만 쓰고 내부는 count만 세야 함)
 *
 * **문자 경계(다음 문자가 달라지는 지점)**를 기준으로 처리하자.
 * 같은 문자가 몇 개 반복됐는지 세다가, 다른 문자가 나타나면 그 시점에 answer에 기록하고 count 초기화.
 *
 * 마지막 문자 처리를 쉽게 만들기 위해 더미 문자(s + " ")를 추가하면 끝 경계를 따로 안 처리해도 됨.
 *
 * 즉,
 * 네 로직은 "한 문자씩 보고, 같으면 while로 계속 세기"였지만,
 * **올바른 발상은 "문자 경계만 감지하고, count를 하나의 루프에서만 관리"**로 단순화하는 거야.
 *
 * sol 2)
 *
 */

import java.util.*;

public class Main0111 {

    public String solution(String s){
//        String answer = "";
        StringBuilder answer = new StringBuilder();
        s += " ";
        int count = 1;

        for(int i = 0; i < s.length() - 1; i++){
            if(s.charAt(i) == s.charAt(i+1)){
                count++;
            }else{
                answer.append(s.charAt(i));
                if(count >1) answer.append(count);
                count = 1;
            }
        }
        return answer.toString();
    }

    public static void main(String[] args){
        Main0111 T = new Main0111();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();

        System.out.println(T.solution(str));
    }
}
