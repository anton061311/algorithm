import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        
        int[] answer = {};
		StringBuilder sb = new StringBuilder();
        
        sb.append(my_string.replaceAll("[^0-9]", ""));
        
        answer = new int[sb.length()];
        
        for (int i = 0; i < answer.length; i ++) {
            answer[i] = sb.charAt(i) - '0';
        }
        
        
        Arrays.sort(answer);
        
        return answer;
    }
}