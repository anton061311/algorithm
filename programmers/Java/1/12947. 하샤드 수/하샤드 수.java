class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        
        int sum = 0;
        int xx = x;
        while(x > 0) {
            sum += x % 10;
            x /= 10;
        }
        
        if(xx % sum != 0) return false;
        else return true;
    }
}