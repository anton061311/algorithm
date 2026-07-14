package __backjoon__._2025;

import java.io.*;
import java.util.Arrays;

public class Baekjoon2108_R {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        for (int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        bw.append(String.valueOf(averageValue(arr))).append("\n")
                .append(String.valueOf(medianValue(arr))).append("\n")
                .append(String.valueOf(frequentValue(arr))).append("\n")
                .append(String.valueOf(rangeValue(arr))).append("\n");

        bw.flush();
        bw.close();
        br.close();
    }

    static int averageValue(int[] num) {
        int sum = 0;
        for (int i = 0; i < num.length; i++){
            sum += num[i];
        }
        return (int)Math.round(sum / (double) num.length);
    }

    static int medianValue(int[] num) {
        return num[num.length / 2];
    }

    static int frequentValue(int[] num) {
        // 문제에서 주어진 수의 범위는 -4000 ~ 4000이므로, 인덱스 오프셋 4000 사용
        int[] frequency = new int[8001];
        for (int n : num) {
            frequency[n + 4000]++;
        }
        int maxFreq = 0;
        for (int freq : frequency) {
            if (freq > maxFreq) {
                maxFreq = freq;
            }
        }

        boolean firstFound = false;
        int mode = 0;
        for (int i = 0; i < frequency.length; i++){
            if (frequency[i] == maxFreq) {
                if (!firstFound) {
                    mode = i - 4000;
                    firstFound = true;
                } else {
                    mode = i - 4000;
                    break;
                }
            }
        }
        return mode;
    }

    static int rangeValue(int[] num) {
        return Math.abs(num[num.length - 1] - num[0]);
    }
}
