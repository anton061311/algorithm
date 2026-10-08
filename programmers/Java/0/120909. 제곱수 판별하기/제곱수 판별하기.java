class Solution {
    public int solution(int n) {
        
        for (int i = 0; i <= n / 2; i++){
            if(n == i * i) return 1;
        }
            
        
        return 2;
    }
}