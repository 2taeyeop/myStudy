class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
       
        int r_numer = numer1 * denom2 + numer2 * denom1;
        int r_denom = denom1 * denom2;
        
        int gcd = gcd(r_numer, r_denom);
        answer[0] = r_numer / gcd;
        answer[1] = r_denom / gcd;
        
        return answer;
    }
    
    private int gcd(int p, int q) {
        if (q == 0) return p;
        return gcd(q, p%q);
    }
}