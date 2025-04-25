class Solution {
    public String solution(int q, int r, String code) {
        String answer = "";

        int i = 0; 
        while(i < code.length()){
            if(i % q == r){
                answer += code.charAt(i);
            }
            i++;
        }
        return answer;
    }
}