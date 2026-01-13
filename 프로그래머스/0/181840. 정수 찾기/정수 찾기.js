function solution(num_list, n) {
    var answer = 0;
    
    if(num_list.includes(n) == 1){
         answer = 1;
    }
    else{
        answer = 0;
    }
    
    return answer;
}