class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        int compare1 = Integer.parseInt(""+ a + b);
        int compare2 = 2 * a * b;
        
        answer = compare1 > compare2 ? compare1 : compare2;
        return answer;
    }
}