package __backjoon__._2025;

import java.io.*;

/**
 *     씨발 근데 왜 배열을 썼지? 어차피 매판 테스트마다 초기화 되니까 이전 테스트 케이스의
 *     입력값은 이후 케이스에서 필요가 없으니까 배열을 사요해서 굳이 메모리 소모를 할 필요가 없다.
 */
public class Baekjoon10809_R {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        int[] alphabet = new int[26];
        for(int i = 0; i < alphabet.length; i++){
            alphabet[i] = -1;
        }

        for(int i = 0; i < s.length(); i++){
            if(alphabet[s.charAt(i) - 'a'] == -1){
                alphabet[s.charAt(i) - 'a'] = i;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int arr : alphabet){
            sb.append(arr).append(" ");
        }

        bw.write(sb.toString().trim());
        bw.flush();
        bw.close();
        br.close();
    }
}

