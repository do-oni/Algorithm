package main.java.algorithm.practice.leetcode.greedy;

public class MinimumOperationsToMakeTheArrayIncreasing {
    public int minOperations(int[] nums) {
        int answer = 0;

        if (nums.length <= 1) {
            return 0;
        }

        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] < nums[i]) continue;

            answer += (nums[i - 1] - nums[i] + 1);
            nums[i] = nums[i - 1] + 1;
        }
        return answer;
    }
}
