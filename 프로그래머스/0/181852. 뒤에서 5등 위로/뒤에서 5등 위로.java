import java.util.Arrays;
class Solution {
    public int[] solution(int[] num_list) {  
        int[] answer = new int[num_list.length - 5];            
        Arrays.sort(num_list);
         
        return Arrays.copyOfRange(num_list, 5, num_list.length);
    }
}