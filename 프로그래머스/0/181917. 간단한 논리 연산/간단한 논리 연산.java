class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = true;
        answer = reverse_v_calc(v_calc(x1, x2), v_calc(x3, x4));
        return answer;
    }
    
    public boolean v_calc(boolean a, boolean b){
        if(a == true || b == true){
            return true;
        }
        return false;
    }
    public boolean reverse_v_calc(boolean a, boolean b){
        if(a == true && b == true){
            return true;
        }
        return false;
    }
}