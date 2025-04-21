import java.util.ArrayList;

class Solution {
    public String solution(int[] numLog) {
        ArrayList <String> answer = new ArrayList<>();
        
        for(int i = 1; i < numLog.length; i++){
            int current = numLog[i] - numLog[i - 1];
            
            if(current == 1){
                answer.add("w");
            }
            else if(current == -1){
                answer.add("s");
            }
            else if(current == 10){
                answer.add("d");
            }
            else if(current == -10){
                answer.add("a");
            }
        }
        return String.join("", answer);
    }
}