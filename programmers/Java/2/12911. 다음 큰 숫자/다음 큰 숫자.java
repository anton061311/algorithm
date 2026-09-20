class Solution {
    public int solution(int n) {
        
        int binaryCount = Integer.bitCount(n);
        
        while (true) {
            if(Integer.bitCount(++n) == binaryCount) break;
        }
        
        
        
        return n;
    }
}