import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public long solution(long n) {
        
		char[] c = String.valueOf(n).toCharArray();
        Arrays.sort(c);
        
        for (int i = 0; i < c.length / 2; i++) {
            char tmp = c[i];
            c[i] = c[c.length - 1 - i];
            c[c.length - 1 - i] = tmp;
        }
        
        String result = new String(c);
        
        return Long.parseLong(result);
    }
}