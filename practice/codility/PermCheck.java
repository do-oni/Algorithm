package main.java.algorithm.practice.codility;

import java.util.HashSet;

public class PermCheck {

    public int solution(int[] A) {
        // write your code in Java SE 8
        // 배열 사이즈만큼 중복 없이 저장
        HashSet<Integer> hs = new HashSet<>();

        for (int i = 1; i < A.length + 1; i++) {
            hs.add(i);
        }

        // 배열 값이 HashSet에 들어있다면 제거
        for (int i = 0; i < A.length; i++) {
            if (hs.contains(A[i])) hs.remove(A[i]);
        }

        // HashSet이 비었다면 순열, 값이 남아있다면 순열 X
        if (hs.isEmpty()) return 1;

        return 0;
    }

}
