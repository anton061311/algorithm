package __backjoon__._2025;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon1920_R {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 첫 번째 배열
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        // 두 번째 배열
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < M; i++){
            int key = Integer.parseInt(st.nextToken());
            if(binarySearch(arr, key)){
                bw.write("1\n");
            } else {
                bw.write("0\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }

    // binarySearch 메서드
    static boolean binarySearch(int[] arr, int key){
        int low = 0;
        int high = arr.length - 1;
        while (low <= high){
            int mid = (low + high) / 2;
            if(arr[mid] == key){
                return true;
            } else if(arr[mid] < key){
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }
}
