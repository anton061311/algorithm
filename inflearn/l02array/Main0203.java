/**
 */

package myself.l02array;
import java.util.*;

public class Main0203 {

    public String solution(int n , int[] arrA, int[] arrB){
        String answer = "";
        for(int i = 0; i < n; i++){
            if(arrA[i] > arrB[i]){
                if(arrA[i] == 3 && arrB[i] == 1){
                    answer += "B\n";
                    continue;
                }
                answer += "A\n";
            }else if(arrA[i] < arrB[i]){
                if(arrA[i] == 1 && arrB[i] == 3){
                    answer += "A\n";
                    continue;
                }
                answer += "B\n";
            }else{
                answer += "D\n";
            }
        }
//        for(int i = 0; i < n; i++){
//            if(arrA[i] == arrB[i]){
//                answer += "D\n";
//            } else if(
//                    (arrA[i] == 1 && arrB[i] == 3) ||  // 가위 vs 보
//                            (arrA[i] == 2 && arrB[i] == 1) ||  // 바위 vs 가위
//                            (arrA[i] == 3 && arrB[i] == 2)     // 보 vs 바위
//            ){
//                answer += "A\n";
//            } else {
//                answer += "B\n";
//            }
//        }
        return answer;
    }


    public static void main(String[] args){
        Main0203 T = new Main0203();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arrA = new int[n];
        int[] arrB = new int[n];
        for(int i = 0; i < n; i++){
            arrA[i] = kb.nextInt();
        }
        for(int i = 0; i < n; i++){
            arrB[i] = kb.nextInt();
        }
        System.out.println(T.solution(n,arrA,arrB));
    }
}
