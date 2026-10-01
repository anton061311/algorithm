class Solution {
    public int solution(int a, int b) {
        
        int tmpA = 1;
        // a + b 
        while(b / tmpA > 0){
            tmpA *= 10;
        }
        
        // b + a
        
		int tmpB = 1;
        while(a / tmpB > 0) {
            tmpB *= 10;
		}
        
        return Math.max(a*tmpA + b, a + b*tmpB);
    }
}