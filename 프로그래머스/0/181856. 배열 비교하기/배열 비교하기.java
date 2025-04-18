class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        
        if(arr1.length != arr2.length){
            answer = arr1.length > arr2.length ? 1 : -1;
        }
        else if(arr1.length == arr2.length){
            int sum_arr1 = 0;
            for(int i = 0; i < arr1.length; i++){
                sum_arr1 += arr1[i];
            }
            
            int sum_arr2 = 0;
            for(int i = 0; i < arr2.length; i++){
                sum_arr2 += arr2[i];
            }
            
            if(sum_arr1 == sum_arr2){
                answer = 0;
            }
            else{
                answer = sum_arr1 > sum_arr2 ? 1 : -1;
            }
        }
        return answer;
    }
}