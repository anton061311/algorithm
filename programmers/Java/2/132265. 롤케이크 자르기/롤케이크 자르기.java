import java.util.*;

class Solution {
    public int solution(int[] topping) {
        int answer = 0;

        Map<Integer, Integer> right = new HashMap<>();
        Set<Integer> left = new HashSet<>();

        for (int t : topping) {
            right.put(t, right.getOrDefault(t, 0) + 1);
        }

        for (int i = 0; i < topping.length - 1; i++) {
            int current = topping[i];

            left.add(current);

            right.put(current, right.get(current) - 1);
            if (right.get(current) == 0) {
                right.remove(current);
            }

            if (left.size() == right.size()) {
                answer++;
            }
        }

        return answer;
    }
}