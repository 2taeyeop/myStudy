import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        ArrayList <Integer> answer = new ArrayList <>();
        
        for(int i = 0; i <= n; i++){
            if(i % 2 != 0){
                answer.add(i);
            }
        }
        return answer.stream().mapToInt(i -> i).toArray();
    }
}