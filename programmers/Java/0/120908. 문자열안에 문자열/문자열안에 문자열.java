class Solution {
    public int solution(String str1, String str2) {
        
      //  for (int i = 0; i <= str1.length() - str2.length(); i++) {
      //      String tmp = str1.substring(i, i + str2.length());
      //      if (tmp.equals("str2")) return 1;
      //  }
        
        return str1.contains(str2) ? 1 : 2;
        
    }
}