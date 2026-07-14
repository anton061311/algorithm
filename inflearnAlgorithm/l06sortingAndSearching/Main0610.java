/**
 * lt(1) -------------- rt(8)
 * 1-2--4----8-9
 * 1, 2, 4, 1
 * mid일 때 3마리보다 더 필요하면
 */
package myself.l06sortingAndSearching;


import java.util.*;


public class Main0610 {

    public int count(int[] arr, int dist){
        int horseCount = 1;
        int recentPoint = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (dist <= arr[i] - recentPoint){
                horseCount++;
                recentPoint = arr[i];
            }
        }

        return horseCount;
    }

    public int solution(int N, int C, int[] arr){
        int answer = 0;
        Arrays.sort(arr);
        int lt = Integer.MAX_VALUE;
        int rt = arr[N-1] - arr[0];
        for(int i = 0; i < arr.length-1; i++) lt = Math.min(lt,arr[i+1]-arr[i]);

        while(lt <= rt){
            int mid = (lt+rt)/2;
            if (count(arr, mid) >= C){
                answer = mid;
                lt = mid + 1;
            }else rt = mid - 1;
        }

        return answer;
    }

    public static void main(String[] args){
        Main0610 T = new Main0610();
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        int C = kb.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) arr[i] = kb.nextInt();
        System.out.println(T.solution(N,C,arr));
    }
}
