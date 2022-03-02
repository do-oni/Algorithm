package main.java.algorithm.practice.leetcode.string;

import java.util.Arrays;

public class FinalValueAfterOperations {

    public int solution1(String[] operations) {
        int answer = 0;

        for (String s : operations) {
            if (s.contains("-")) answer -= 1;
            else if (s.contains("+")) answer += 1;
        }

        return answer;
    }

    public int solution2(String[] operations) {
        return Arrays.stream(operations, 0, operations.length)
                .mapToInt(operation -> operation.charAt(1) == '+' ? 1 : -1)
                .sum();
    }

}
