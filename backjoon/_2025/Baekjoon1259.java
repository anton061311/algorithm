package __backjoon__._2025;

import java.io.*;

/**
 *  - 결론
 *    . for문에서 0번째와 마지막 문자만 보고 판단해서 넘어가는 코드로 짜서
 *      isPalindrome을 추가해줌
 *
 */
public class Baekjoon1259 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String num = br.readLine();
        while(!num.equals("0")){
            boolean isPalindrome = true;
            for(int i = 0; i < num.length() / 2; i++){
                if(num.charAt(i) != num.charAt(num.length() - 1 - i)){
                    isPalindrome = false;
                    break;
                }
            }
            if (isPalindrome){
                bw.append("yes").append("\n");
            }else {
                bw.append("no").append("\n");
            }
            num = br.readLine();
        }


        bw.flush();
        bw.close();
        br.close();
    }

}
