class Solution {
    public String solution(String code) {
        int mode = 0;
        int idx = 0;
        StringBuilder ret = new StringBuilder();

        for(int i = 0; i < code.length(); i++){
            char current = code.charAt(i);
            
            if(mode == 0){                
                if(current != '1' && i % 2 == 0){
                    ret.append(current);
                }
                else if(current == '1'){
                    mode = 1;
                }
            }
            else if(mode == 1){
                if(current != '1' && i % 2 != 0){
                    ret.append(current);
                }
                else if(current == '1'){
                    mode = 0;
                }
            }
        }
        return ret.length() == 0 ? "EMPTY" : ret.toString();
    }
}