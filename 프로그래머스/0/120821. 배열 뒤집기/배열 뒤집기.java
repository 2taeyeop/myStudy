import java.util.ArrayList;

class Solution {
    public int[] solution(int[] num_list) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        for(int i = 0; i < num_list.length; i++){
            answer.add(i, num_list[num_list.length - i - 1]);
        }
        
        return answer.stream().mapToInt(i -> i).toArray();
    }
}