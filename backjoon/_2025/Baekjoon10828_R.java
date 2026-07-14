package __backjoon__._2025;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *  - push X : 정수 X를 스택에 넣음
 *  -    pop : 가장 위에 있는 정수를 뺴고 출력. 없다면 -1출력
 *  -   size : 스택에 들어있는 정수의 개수출력
 *  -  empty : 비어있으면 1, 아니면 - 출력
 *  -    top : 가장 위에 정수를 출력. 없다면 -1 출력
 *
 *  - 맴버변수
 *   . stack
 *   . N
 *   . top
 *
 *
 *  - 결론
 *   : BufferedWriter를 사용한다고 무조건 빠른 건 아님.
 *     또한 sb는 StringBuiler(가변 객체) 객체이고 이를 String(불변 객체)으로 사용하고 싶다면
 *     새로운 String 객체로 반환받야아 함.
 */
public class Baekjoon10828_R {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] stack = new int[N];
        int index = -1; // 왜?
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < N; i++){
            String command = br.readLine();
            String[] token = command.split(" ");

            switch(token[0]){
                case "push":
                    int x = Integer.parseInt(token[1]);
                    stack[++index] = x;
                    break;
                case "pop":
                    sb.append(index == -1 ? "-1\n" : stack[index--] + "\n");
                    break;
                case "size":
                    sb.append((index + 1) + "\n");
                    break;
                case "empty":
                    sb.append(index == -1 ? "1\n" : "0\n");
                    break;
                case "top":
                    sb.append(index == -1 ? "-1\n" : stack[index] + "\n");
                    break;
            }
        }
        System.out.println(sb.toString());
    }
}
