package __backjoon__._2025;
import java.io.*;
import java.util.StringTokenizer;

/**
 *  - 입력
 *    1. 참가자의 수 N.
 *    2. 공백으로 구분된 사이즈별 신청자의 수.
 *    3. T, P -> 티셔츠, 펜 묶음.
 *
 *  - 출력
 *    1. 티셔츠를 T장씩 최소 몇 묶음 주문해야하는지.
 *    2. 펜을 P자루씩 최대 몇 묶음 주문할 수 있는지, 낱개 몇개 주문하는지.
 *
 *  - 결론
 *    . String.valueOf()는 static메서드로, primitive 타입이나 객체를 문자열로 변환
 *      반면 toString()은 객체의 인스턴스 메서드이기 때문에, primitive 타입에서는 직접 사용 불가
 */
public class Baekjoon30802 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] shirt = new int[6];
        for(int i = 0; i < 6; i++){
            shirt[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int shirtsBundle = Integer.parseInt(st.nextToken());
        int pensBundle = Integer.parseInt(st.nextToken());

        int shirtsCount = 0;
        for(int i = 0; i < 6; i++){
            while(shirt[i] > 0){
                shirt[i] -= shirtsBundle;
                shirtsCount++;
            }
        }
        bw.write(String.valueOf(shirtsCount) + "\n");
        bw.append(String.valueOf(N / pensBundle) + " ");
        bw.append(String.valueOf(N % pensBundle));


        bw.flush();
        bw.close();
        br.close();

    }


}
