import java.util.*;

class Solution {
    public String solution(String my_string, int[] indices) {
        StringBuilder answer = new StringBuilder();
        Set<Integer> comp = new HashSet<>();
        
        for(int i = 0; i < indices.length; i++){
            comp.add(indices[i]);
        }
        
        for(int i = 0; i < my_string.length(); i++){
            if(comp.contains(i) == false){
                answer.append(my_string.charAt(i));
            }
        }
        return answer.toString();
    }
}