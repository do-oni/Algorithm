package main.java.algorithm.practice.leetcode.string;

public class FinalValueAfterOperations {

    public int finalValueAfterOperations(String[] operations) {

        int answer = 0;

        for (String s : operations) {
            if (s.contains("-")) answer -= 1;
            else if (s.contains("+")) answer += 1;
        }

        return answer;
    }

}
