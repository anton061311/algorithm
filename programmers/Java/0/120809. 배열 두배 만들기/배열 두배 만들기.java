class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        
        for(int i = 0; i < answer.length; i++) {
            answer[i] = 2 * numbers[i];
        }
        
        
        return answer;
    }
}