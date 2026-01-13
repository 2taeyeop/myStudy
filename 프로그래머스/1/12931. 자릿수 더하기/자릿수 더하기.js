function solution(n)
{
    var answer = 0;
    var temp = String(n);
    
    for(let i = 0; i < temp.length; i++){
        answer += parseInt(temp[i]);
    }

    return answer;
}