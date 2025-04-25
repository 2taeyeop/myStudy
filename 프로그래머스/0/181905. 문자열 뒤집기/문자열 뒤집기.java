class Solution {
    public String solution(String my_string, int s, int e) {
        char[] answer = my_string.toCharArray();

        while (s < e) {
            char temp = answer[s];
            answer[s] = answer[e];
            answer[e] = temp;
            s++;
            e--;
        }

        return new String(answer);
    }
}