package main.java.algorithm.practice.codility;

public class TapeEquilibrium {

    public int solution(int[] A) {
        // write your code in Java SE 8
        int[] diff = new int[A.length - 1];
        int sum = 0;

        // for문으로 A[1]부터의 총합 구하기
        // 새로운 배열에 차이값 저장
        for (int i = 1; i < A.length; i++) {
            sum += A[i];
        }

        for (int i = 0; i < A.length - 1; i++) {
            diff[i] = Math.abs(A[i] - sum);
            sum -= A[i + 1];
            A[i + 1] += A[i];
        }

        int answer = diff[diff.length - 1];

        for (int i : diff) {
            answer = Math.min(i, answer);
        }

        return answer;
    }

}
