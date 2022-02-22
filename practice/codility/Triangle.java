package main.java.algorithm.practice.codility;

import java.util.Arrays;

public class Triangle {

    // O(N*log(N))
    public int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);

        if (A.length < 3) return 0;

        for (int i = 0; i < A.length - 2; i++) {
            long P = A[i], Q = A[i + 1], R = A[i + 2];
            if (P + Q > R) return 1;
        }
        return 0;
    }

}
