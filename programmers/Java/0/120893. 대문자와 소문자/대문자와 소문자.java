class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        
       // for (char c : my_string.toCharArray()) {
       //     if (Character.isLowerCase(c)) answer.append(Character.toUpperCase(c));
        //    else answer.append(Character.toLowerCase(c));
       // }
        
        
        for (char c : my_string.toCharArray()) {
            answer.append(
                Character.isUpperCase(c) ? Character.toLowerCase(c) : Character.toUpperCase(c)
            );
        }
        
        return answer.toString();
    }
}