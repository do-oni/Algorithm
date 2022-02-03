function solution(n) {
    var answer = 0;
    
    for(let i=1; i<=n; i++) {
        if(n % i === 0 && n <= 3000) {
            answer += i;
        }
    }
    return answer;
}
