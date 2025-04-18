class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        int compare1 = Integer.parseInt(Integer.toString(a) + Integer.toString(b));
        int compare2 = Integer.parseInt(Integer.toString(b) + Integer.toString(a));
        
        if(compare1 >= compare2){
            answer = compare1;
        }
        else{
            answer = compare2;
        }
        return answer;
    }
}