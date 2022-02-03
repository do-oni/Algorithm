package main.java.algorithm.Practice.Programmers;

public class SumOfDivisor {
    public int solution(int n) {
        int answer = 0;
//      for(int i=1; i<n; i++) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0 && n <= 3000) {
                answer += i;
            }
        }
        return answer + n;
    }
}