class Solution {
    public String solution(String my_string, int[][] queries) {
        char[] answer = my_string.toCharArray();
        
        for(int i = 0; i < queries.length; i++){
            int s = queries[i][0];
            int e = queries[i][1];
            
            while(s < e){
                char temp = answer[s];
                answer[s] = answer[e];
                answer[e] = temp;
                s++;
                e--;
            }
        }
        return new String(answer);
    }
}