package myself.l10dynamicProgramming;

import java.util.*;

class Block implements Comparable<Block>{
    int s;
    int h;
    int w;

    public Block(int s, int h, int w) {
        this.s = s;
        this.h = h;
        this.w = w;
    }

    @Override
    public int compareTo(Block o) {
        return o.s - this.s;
    }
}

public class Main1004 {

    static int[] dy;

    public int solution(ArrayList<Block> arr){
        int answer = 0;
        Collections.sort(arr);
        dy[0] = arr.get(0).h;
        answer = dy[0];

        for (int i = 1; i < arr.size(); i++) {
            int max = 0;

            for(int j = i - 1; j >= 0; j--){
                if(arr.get(j).w > arr.get(i).w && dy[j] > max){
                    max = dy[j];
                }
            }
            dy[i] = max + arr.get(i).h;
            answer = Math.max(answer, dy[i]);
        }

        return answer;
    }

    public static void main (String[] args) {
        Main1004 T = new Main1004();
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        dy = new int[N];

        ArrayList<Block> arr = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            arr.add(new Block(a, b, c));
        }

        System.out.println(T.solution(arr));
    }
}
