package myself.l08advanceDFSBFS;

import java.util.*;

public class Main0815 {

    static int N, M, answer = Integer.MAX_VALUE, pizzaTotal;
    static int[] comb;
    static ArrayList<int[]> pizza, house;

    void dfs(int depth, int start){
        if(depth == M) {
            int sum = 0;
            for(int[] hs : house){
                int dist = Integer.MAX_VALUE;

                for(int idx : comb){
                    int[] pz = pizza.get(idx);
                    int d = Math.abs(hs[0] - pz[0]) + Math.abs(hs[1] - pz[1]);
                    dist = Math.min(dist, d);
                }
                sum += dist;
            }
            answer = Math.min(answer, sum);
        }
        else{
            for (int i = start; i < pizzaTotal; i++){
                comb[depth] = i;
                dfs(depth + 1, i + 1);
            }
        }
    }

    public static void main (String[] args) throws Exception{
        Main0815 T = new Main0815();
        Scanner scanner = new Scanner(System.in);

        N = scanner.nextInt();
        M = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                int tmp = scanner.nextInt();
                if(tmp == 1) house.add(new int[]{i,j});
                if(tmp == 2) pizza.add(new int[]{i,j});
            }
        }
        pizzaTotal = pizza.size();
        comb = new int[M];
        T.dfs(0,0);
        System.out.println(answer);
    }

}
