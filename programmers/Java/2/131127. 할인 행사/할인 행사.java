import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;

        Map<String, Integer> target = new HashMap<>();
        for (int i = 0; i < want.length; i++) {
            target.put(want[i], number[i]);
        }

        Map<String, Integer> window = new HashMap<>();

        for (int i = 0; i < discount.length; i++) {
            window.put(discount[i], window.getOrDefault(discount[i], 0) + 1);

            if (i >= 10) {
                String old = discount[i - 10];
                window.put(old, window.get(old) - 1);

                if (window.get(old) == 0) {
                    window.remove(old);
                }
            }

            if (i >= 9 && window.equals(target)) {
                answer++;
            }
        }

        return answer;
    }
}