package main.java.algorithm.practice.codility;

import java.util.HashSet;

public class MissingInteger {

    public int solution(int[] A) {
        // write your code in Java SE 8
        HashSet<Integer> hs = new HashSet<>();

        for (int i : A) hs.add(i);

        for (int i = 1; i < Integer.MAX_VALUE; i++) {
            if (!hs.contains(i)) return i;
        }

        return -1;
    }

}