/**
 * total에서 sum을 빼면 sum이 나와야 한다.
 * 그렇다면 total/2 = sum이라면 반환 != 이라면 dfs 메서드를 진행한다.
 * sum보다 total이 크다면 더하고 크다면 뺀다
 * dfs의 인자로는 arr, sum이 될듯
 * total 전역변수로
 */
package myself.l08advanceDFSBFS;

import java.util.*;

public class Main0801 {

    static int total;
    static int N;
    static int sum;
    static boolean flag;
    static int[] arr;

    public void dfs(int L, int sum) {

        if(flag || sum > total/2) return;
        if(L == N){
            if(total/2 == sum) flag = true;
            return;
        }
        dfs(L+1, sum+arr[L]);
        dfs(L+1, sum);

    }

    public static void main(String[] args){

        Main0801 T = new Main0801();
        Scanner scanner = new Scanner(System.in);

        N = scanner.nextInt();

        arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
            total += arr[i];
        }

        T.dfs(0, 0);
        System.out.println(flag ? "YES" : "NO");
    }
}
