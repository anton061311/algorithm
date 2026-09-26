class Solution {
    public String solution(String rsp) {
        StringBuilder answer = new StringBuilder();
        
        for(char c : rsp.toCharArray()) {
            int tmp = Integer.parseInt(String.valueOf(c));
            switch(tmp) {
                    case 2 -> answer.append("0");
                    case 5 -> answer.append("2");
                    case 0 -> answer.append("5");
            }
        }
        
        return answer.toString();
    }
}