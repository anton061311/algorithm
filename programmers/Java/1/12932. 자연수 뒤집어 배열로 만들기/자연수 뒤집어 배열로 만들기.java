class Solution {
    public int[] solution(long n) {
        int[] answer = {};
        String str = String.valueOf(n);
        answer = new int[str.length()];
        
        for (int i = 0; i < str.length(); i++) {
            answer[i] = Character.getNumericValue(str.charAt(str.length() - i - 1));
        }
        
        return answer;
    }
}