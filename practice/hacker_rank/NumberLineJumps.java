package main.java.algorithm.practice.hacker_rank;

public class NumberLineJumps {

    public static String kangaroo(int x1, int v1, int x2, int v2) {
        // Write your code here
        int v = v1 - v2;

        if (v <= 0) {
            return "NO";
        }

        int x = x1 - x2;

        return x % v == 0 ? "YES" : "NO";
    }

}
