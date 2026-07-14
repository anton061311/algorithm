package myself.l01string;

import java.util.Scanner;

public class Main0103 {

    public String solution(String str){
        String answer = "";

        int startIndex = 0;
        int maxLength = 0;
        for(int i = 0; i <= str.length(); i++){
            if(i == str.length() || str.charAt(i) == ' ') {
                if (maxLength < i - startIndex){
                    maxLength = i - startIndex;
                    answer = str.substring(startIndex, i);
                }
                startIndex = i + 1;
            }
        }

        return answer;
    }

    public static void main(String[] args){
        Main0103 T = new Main0103();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(T.solution(str));
    }/*패키지명 지울 것*/
}
