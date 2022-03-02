package main.java.algorithm.practice.leetcode.greedy;

public class 1221 {

public int balancedStringSplit(String s) {
        int cnt = 0;
        int answer = 0;

        for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) == 'R') cnt += 1;
        else cnt -= 1;

        if (cnt == 0) answer += 1;
        }

        return answer;
        }

}
