import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        
        StringBuilder sb = new StringBuilder();
        
        sb.append(a).append(b);
        
        sb.toString().replace(" ", "");
        System.out.println(sb);
        
    }
}