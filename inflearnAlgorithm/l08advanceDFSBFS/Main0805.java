package myself.l08advanceDFSBFS;

import java.util.*;

class Main0805{

    static int N, M, answer = Integer.MAX_VALUE;

    public void dfs(int level, int sum, Integer[] arr){

        if(sum > M) return;
        if(level >= answer) return;

        if(sum == M){
            answer = Math.min(answer, level);
        }else{
            for(int i = 0; i < N; i++) {
                dfs(level + 1, sum + arr[i], arr);
            }
        }

    }
    public static void main(String[] args){
        Main0805 T = new Main0805();
        Scanner scanner = new Scanner(System.in);

        N = scanner.nextInt();

        Integer[] arr=new Integer[N];
        for(int i = 0; i < N; i++) arr[i]=scanner.nextInt();

        Arrays.sort(arr, Collections.reverseOrder());

        M = scanner.nextInt();

        T.dfs(0, 0, arr);

        System.out.println(answer);
    }
}
