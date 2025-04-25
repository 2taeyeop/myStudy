import java.util.*;

class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        
        ArrayList <String> prefix = new ArrayList <>();
        
        for(int i = 0; i < my_string.length(); i++){
            prefix.add(my_string.substring(0, i));
        }
        
        if(prefix.contains(is_prefix) == true){
            answer = 1;
        }
        return answer;
    }
}