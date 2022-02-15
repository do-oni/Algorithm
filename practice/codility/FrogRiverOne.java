package main.java.algorithm.practice.codility;

import java.util.HashSet;

public class FrogRiverOne {

    public int solution(int X, int[] A) {
        // write your code in Java SE 8
        // X 까지의 연속된 수 찾아서 index 값 구하기
        HashSet<Integer> hs = new HashSet<>();

        for (int i = 0; i < A.length; i++) {
            hs.add(A[i]);

            if (hs.size() == X) return i;
        }

        return -1;
    }

}
