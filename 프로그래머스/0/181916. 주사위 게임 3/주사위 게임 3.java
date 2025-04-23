import java.lang.Math;
import java.util.Arrays;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        int[] dice = {a, b, c, d};
        Arrays.sort(dice);
        
        // 4개 모두 같음
        if(dice[0] == dice[3]){
            answer = dice[0] * 1111;
        }
        // 3개 같음
        else if(dice[0] == dice[2]){
            answer = (int)Math.pow(10 * dice[0] + dice[3], 2);
        }
        else if(dice[1] == dice[3]){
            answer = (int)Math.pow(10 * dice[1] + dice[0], 2);
        }
        // 2개 2개 같음
        else if(dice[0] == dice[1] && dice[2] == dice[3]){
            answer = (dice[0] + dice[2]) * Math.abs(dice[0] - dice[2]);
        }
        // 2개 같음
        else if(dice[0] == dice[1])
        {
            answer = dice[2] * dice[3];
        }
        else if(dice[1] == dice[2])
        {
            answer = dice[0] * dice[3];
        }
        else if(dice[2] == dice[3])
        {
            answer = dice[0] * dice[1];
        }
        // 모두 다름
        else{
             answer = dice[0];
        }
        return answer;
    }
}