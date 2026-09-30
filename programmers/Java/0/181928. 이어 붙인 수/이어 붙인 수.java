class Solution {
    public int solution(int[] num_list) {
        
        int sumOfOdd = 0;
        int sumOfEven = 0;
        int oddCount = 1;
        int evenCount = 1;
        
        for (int i = num_list.length - 1; i >= 0; i--) {
            if (num_list[i] % 2 == 0) {
                sumOfEven += evenCount * num_list[i];
                evenCount *= 10;
            } else {
                sumOfOdd += oddCount * num_list[i];
                oddCount *= 10;
            }
        }
        
        
        return sumOfOdd + sumOfEven;
    }
}