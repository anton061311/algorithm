/**
 *
 import java.io.*;
 import java.util.*;

 public class Main {
 public static void main(String[] args) throws IOException {
 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 int n = Integer.parseInt(br.readLine());

 int[][] times = new int[n][2];

 for (int i = 0; i < n; i++) {
 StringTokenizer st = new StringTokenizer(br.readLine());
 times[i][0] = Integer.parseInt(st.nextToken());
 times[i][1] = Integer.parseInt(st.nextToken());
 }

 Arrays.sort(times, (a, b) -> {
 if (a[1] == b[1]) return a[0] - b[0];
 return a[1] - b[1];
 });

 int count = 0;
 int endTime = 0;

 for (int i = 0; i < n; i++) {
 if (times[i][0] >= endTime) {
 endTime = times[i][1];
 count++;
 }
 }

 System.out.println(count);
 }
 } */

/**
 * 그러므로 현재 선택은
 * 미래의 선택 가능성을 최대한 많이 남겨야 한다.
 *
 * 그 미래 가능성을 가장 크게 남기는 선택이 바로: 가장 빨리 끝나는 회의이다.
 */

/**
 *
 1 4
 3 5
 0 6
 5 7
 3 8
 5 9
 6 10
 8 11
 8 12
 2 13
 12 14

 */
package __backjoon__._2026._03;

import java.util.*;
import java.io.*;

class Schedule1931 implements Comparable<Schedule1931> {
    int start, end;

    public Schedule1931(int start, int end){
        this.start = start;
        this.end = end;
    }

    @Override
    public int compareTo(Schedule1931 o){
        if(o.end == this.end) return this.start - o.start;
        else return this.end - o.end;
    }

    @Override
    public String toString(){
        return start + " " + end;
    }

}

public class Bj1931_R {

    public static void main (String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        ArrayList<Schedule1931> arr = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            arr.add(new Schedule1931(s, e));
        }

        Collections.sort(arr);

        int result = 0;
        int endTime = 0;
        for(Schedule1931 o : arr){
            if(o.start >= endTime) {
                endTime = o.end;
                result++;
            }
        }
        System.out.println(result);

    }
}
