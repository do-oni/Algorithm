package main.java.algorithm.practice.hacker_rank.data_structure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoDArray {

    public static int hourglassSum(List<List<Integer>> arr) {
        // Write your code here
        int max = 0;
        int sum = 0;

        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                sum = arr.get(row).get(col) + arr.get(row).get(col + 1) + arr.get(row).get(col + 2);
                sum += arr.get(row + 1).get(col + 1);
                sum += arr.get(row + 2).get(col) + arr.get(row + 2).get(col + 1) + arr.get(row + 2).get(col + 2);

                max = Math.max(sum, max);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        List<List<Integer>> arr = new ArrayList<>();
        arr.add(Arrays.asList(1, 1, 1, 0, 0, 0));
        arr.add(Arrays.asList(0, 1, 0, 0, 0, 0));
        arr.add(Arrays.asList(1, 1, 1, 0, 0, 0));
        arr.add(Arrays.asList(0, 0, 2, 4, 4, 0));
        arr.add(Arrays.asList(0, 0, 0, 2, 0, 0));
        arr.add(Arrays.asList(0, 0, 1, 2, 4, 0));

        System.out.println(hourglassSum(arr));
    }

}
