class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";
        
        for(int i = 0; i < my_strings.length; i++){
            int s = parts[i][0];
            int t = parts[i][1];
            
            String temp = my_strings[i].substring(s, t + 1);
            answer += temp;
        }
        return answer;
    }
}