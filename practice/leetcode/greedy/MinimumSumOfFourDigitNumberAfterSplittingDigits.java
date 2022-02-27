package main.java.algorithm.practice.leetcode;

import java.util.Arrays;
import java.util.stream.Stream;

public class MinimumSumOfFourDigitNumberAfterSplittingDigits {

    public int minimumSum(int num) {

        int[] nums = Stream.of(String.valueOf(num).split("")).mapToInt(Integer::parseInt).toArray();

        Arrays.sort(nums);

        int s1 = nums[0] * 10 + nums[3];
        int s2 = nums[1] * 10 + nums[2];

        return s1 + s2;
    }

}
