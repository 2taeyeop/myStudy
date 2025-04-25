import java.util.*;

class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        ArrayList <String> suffix = new ArrayList<>();
        
        for(int i = 0; i < my_string.length(); i++){
            suffix.add(my_string.substring(i));
        }
        Collections.sort(suffix);
        
        if(suffix.contains(is_suffix) == true){
            answer = 1;
        }
        else{
            answer = 0;
        }
        
        return answer;
    }
}