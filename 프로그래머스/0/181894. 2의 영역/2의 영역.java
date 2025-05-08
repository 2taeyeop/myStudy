import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList <Integer> answer = new ArrayList <>();
        
        int firstIndex = -1;
        int lastIndex = -1;
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 2 && firstIndex == -1){
                firstIndex = i;
            }
            if(arr[i] == 2 && firstIndex != -1){
                lastIndex = i;
            }
        }
        
        if(firstIndex == -1 && lastIndex == -1){
            answer.add(-1);
        }
        else{
            for(int j = firstIndex; j <= lastIndex; j++){
                answer.add(arr[j]);
            }
        }
        
        
        return answer.stream().mapToInt(i -> i).toArray();
    }
}