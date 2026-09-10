import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        Set<String> used = new HashSet<>();

        used.add(words[0]);

        for (int i = 1; i < words.length; i++) {
            String prev = words[i - 1];
            String current = words[i];

            char prevLastChar = prev.charAt(prev.length() - 1);
            char currentFirstChar = current.charAt(0);

            // 1. 앞 단어의 마지막 글자와 현재 단어의 첫 글자가 다름
            // 2. 이미 나온 단어를 다시 말함
            if (prevLastChar != currentFirstChar || used.contains(current)) {
                int person = (i % n) + 1;
                int turn = (i / n) + 1;

                return new int[]{person, turn};
            }

            used.add(current);
        }

        return new int[]{0, 0};
    }
}