package main.java.algorithm.Study.bfs_dfs;
//https://programmers.co.kr/learn/courses/30/lessons/43165

public class TargetNumber {
    public int solution(int[] numbers, int target) {

        int answer = 0;
        answer = bfs(numbers, target, numbers[0], 1)
                + bfs(numbers, target, -numbers[0], 1);

        return answer;
    }

    public int bfs(int[] numbers, int target, int sum, int num) {

        if (num == numbers.length) {
            if (sum == target) {
                return 1;
            } else {
                return 0;
            }
        }

        int result = 0;

        result += bfs(numbers, target, sum + numbers[num], num + 1);
        result += bfs(numbers, target, sum - numbers[num], num + 1);
        return result;

    }
}
