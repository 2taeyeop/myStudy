import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        String answer = "";
        
        for(int i = 0; i < a.length(); i++){
            char test = a.charAt(i);
            
            if(Character.isUpperCase(test)){
                answer += Character.toLowerCase(test);
            }else{
                answer += Character.toUpperCase(test);
            }
        }
        
        System.out.println(answer);
    }
}