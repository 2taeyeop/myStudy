import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        ArrayList <Integer> answer = new ArrayList<>();
        int result = n;
        answer.add(result);
        
        for(int i = 1; i < n; i++){
            if(result != 1){
                if(result % 2 == 0){
                    result = result / 2;
                    answer.add(result);
                }
                else{
                    result = 3 * result + 1;
                    answer.add(result);
                }
            }
        }
        return answer.stream().mapToInt(i -> i).toArray();
    }
}