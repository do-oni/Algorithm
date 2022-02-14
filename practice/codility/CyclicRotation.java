package main.java.algorithm.practice.codility;

public class CyclicRotation {

    public int[] solution(int[] A, int K) {
        // write your code in Java SE 8
        if (A.length == 0) return A;

        for (int i = 0; i < K; i++) {
            int end = A[A.length - 1];

            for (int j = A.length - 1; j > 0; j--) {
                A[j] = A[j - 1];
            }
            A[0] = end;
        }

        return A;
    }

}