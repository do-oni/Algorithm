package main.java.algorithm.practice.leetcode.hash_table;

import java.util.HashMap;

public class TwoSum {

    public static int[] twoSum1(int[] nums, int target) {
        int[] result = new int[2];

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    break;
                }
            }
        }
        return result;
    }

    public static int[] twoSum2(int[] numbers, int target) {
        HashMap<Integer, Integer> indexMap = new HashMap<Integer, Integer>();

        for (int i = 0; i < numbers.length; i++) {
            Integer requiredNum = (Integer) (target - numbers[i]);
            if (indexMap.containsKey(requiredNum)) {
                int toReturn[] = {indexMap.get(requiredNum), i};
                return toReturn;
            }

            indexMap.put(numbers[i], i);
        }
        return null;
    }
}
