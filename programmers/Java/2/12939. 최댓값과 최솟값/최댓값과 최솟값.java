import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] strArr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        
        int[] intArr = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            intArr[i] = Integer.parseInt(strArr[i]);
        }
        
        Arrays.sort(intArr);
        
        sb.append(String.valueOf(intArr[0]))
          .append(" ")
          .append(String.valueOf(intArr[strArr.length - 1]));
        
        return sb.toString();
    }
}