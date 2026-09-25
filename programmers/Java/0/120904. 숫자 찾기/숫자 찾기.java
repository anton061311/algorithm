class Solution {
    public int solution(int num, int k) {
        int index = String.valueOf(num).indexOf(String.valueOf(k));
        return index < 0 ? -1 : index + 1;
    }
}