package main.java.algorithm.practice.codility;

import java.util.Arrays;

public class MaxCounters {

    public int[] solution77(int N, int[] A) {
        // write your code in Java SE 8
        // 효율성 문제로 77점인 풀이
        // 모든 요소가 0인 N 길이만큼의 배열
        int[] answer = new int[N];
        int max = 0;

        // 배열 값의 index 1씩 증가시키고 max 값도 갱신
        for (int i = 0; i < A.length; i++) {
            if (A[i] > answer.length) {
                Arrays.fill(answer, max);
            } else {
                if (answer[A[i] - 1] == max) {
                    max++;
                    answer[A[i] - 1]++;
                } else {
                    answer[A[i] - 1]++;
                }
            }
        }
        return answer;
    }

    // 개선한 풀이
    public int[] solution100(int N, int[] A) {
        // write your code in Java SE 8
        int[] answer = new int[N];
        int max = 0;
        int maxCnt = 0; // 시간 복잡도를 줄이기 위해 max counter를 사용

        for (int i = 0; i < A.length; i++) {
            if (A[i] > answer.length) {
                maxCnt = max; // 전부 max값으로 바꿔야 할 경우 현재 max값만 임시 저장
            } else {
                if (answer[A[i] - 1] < maxCnt) {
                    answer[A[i] - 1] = maxCnt; // 임시 저장한 값부터 올려주기 위함
                }
                answer[A[i] - 1]++;

                if (answer[A[i] - 1] > max) {
                    max = answer[A[i] - 1]; // 최대값 저장
                }
            }
        }

        if (maxCnt > 0) {
            for (int i = 0; i < answer.length; i++) {
                if (answer[i] < maxCnt) {
                    answer[i] = maxCnt; // 마지막에 한번에 수행
                }
            }
        }
        return answer;
    }

}
