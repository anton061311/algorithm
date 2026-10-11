class Solution {
    public String solution(String my_string) {
        
        return my_string.replaceAll("[aeiou]", "");
        
//         String[] replaceChar = {"a", "e", "i", "o", "u"};
//         for (String x : replaceChar) {
//             my_string = my_string.replace(x, "");
//         }
        
//         return my_string;
    }
}