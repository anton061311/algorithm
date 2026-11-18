class Solution {
    public int[] solution(int n, long left, long right) {
        int[] answer = new int[(int) (right -left + 1)];
        
        for (int i = 0; i < answer.length; i++) {
            long index = left + i;
            
            long row = index / n;
            long col = index % n;
            
            answer[i] = (int) (Math.max(row, col) + 1);
        }
        
        return answer;
    }
}