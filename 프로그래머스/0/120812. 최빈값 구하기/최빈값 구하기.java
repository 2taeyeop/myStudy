class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int[] count = new int[array.length];
        
        // 중복 횟수 count 배열에 추가
        for(int i = 0; i < array.length; i++){
            count[i] = 0;
            for(int j = 0; j < array.length; j++){
                if(array[i] == array[j]){
                    count[i]++;
                }
            }
        }
        
        // 최빈값 인덱스 찾기
        int max = 0;
        int idx = 0;
        boolean mode = false;
        for(int l = 0; l < count.length; l++){
            if(max < count[l]){
                 max = count[l];
                 idx = l;
                 answer = array[l];
            }
            else if(count[l] == max && array[l] != array[idx]){
                answer = -1;
            }
        }
        
        return answer;
    }
}