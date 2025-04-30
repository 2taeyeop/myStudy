class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        
        for (int i = 0; i < my_string.length(); i++) {
            char comp = my_string.charAt(i);

            if (comp >= 'A' && comp <= 'Z') {
                answer[comp - 'A']++;
            } else if (comp >= 'a' && comp <= 'z') {
                answer[26 + comp - 'a']++;
            }
        }
        return answer;
    }
}