package main.java.algorithm.practice.hacker_rank;

import java.util.List;

public class AppleAndOrange {

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        // Write your code here
        int apple = 0;
        int orange = 0;

        for (Integer position : apples) {
            if (a + position >= s && a + position <= t) {
                apple++;
            }
        }

        for (Integer position : oranges) {
            if (b + position >= s && b + position <= t) {
                orange++;
            }
        }

        System.out.println(apple);
        System.out.println(orange);

    }

}
