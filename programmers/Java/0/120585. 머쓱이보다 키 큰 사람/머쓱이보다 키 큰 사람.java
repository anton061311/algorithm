class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        
        for (int x : array) {
            if(height < x) answer++;
        }
        
        return answer;
    }
}