package main.java.algorithm.practice.codility;

import java.util.Arrays;

public class MaxProductOfThree {

    // Performance 0
    // Correctness 100
    // O(N**3)
    public int solution1(int[] A) {
        // write your code in Java SE 8
        int answer = Integer.MIN_VALUE;

        if (A.length < 3) {
            return -1;
        }

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < i; j++) {
                for (int k = 0; k < j; k++) {
                    answer = Math.max(answer, A[i] * A[j] * A[k]);
                }
            }
        }
        return answer;
    }

    // Performance 40
    // Correctness 50
    public int solution2(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);

        int answer = Integer.MIN_VALUE;
        int size = A.length;

        if (A.length < 3) {
            return -1;
        }

        answer = Math.max(answer, A[A.length - 1] * A[A.length - 2] * A[A.length - 3]);

        return answer;
    }

    // Performance 100
    // Correctness 100
    // O(N * log(N))
    public int solution3(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);

        int size = A.length;
        int answer = A[size - 1] * A[size - 2] * A[size - 3];

        if (A[0] <= 0 && A[1] <= 0 && A[size - 1] >= 0) {
            if (A[0] * A[1] * A[size - 1] > answer) answer = A[0] * A[1] * A[size - 1];
        }

        return answer;
    }

}
