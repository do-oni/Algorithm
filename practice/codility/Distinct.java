package main.java.algorithm.practice.codility;

import java.util.HashSet;

public class Distinct {

    public int solution(int[] A) {
        // write your code in Java SE 8
        HashSet<Integer> hs = new HashSet<Integer>();

        for (int i : A) {
            hs.add(i);
        }

        return hs.size();
    }

}
