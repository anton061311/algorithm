package __backjoon__._2025;

import java.io.IOException;
import java.util.Scanner;

/**
 *     씨발 근데 왜 배열을 썼지? 어차피 매판 테스트마다 초기화 되니까 이전 테스트 케이스의
 *     입력값은 이후 케이스에서 필요가 없으니까 배열을 사요해서 굳이 메모리 소모를 할 필요가 없다.
 */
public class Baekjoon2775 {

    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while(T > 0){
            int k = scanner.nextInt();
            int n = scanner.nextInt();
            int[] arr = new int[n + 1];
            for(int i = 1; i <= n; i++){
                arr[i] = i;
            }
            for(int i = 1; i <= k; i++){
                for(int j = 2; j <= n; j++){
                    arr[j] = arr[j - 1] + arr[j];
                }
            }
            System.out.println(arr[n]);
            T--;
        }

//        bw.flush();
//        bw.close();
//        br.close();
    }
}



