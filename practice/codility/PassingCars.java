package main.java.algorithm.practice.codility;

public class PassingCars {

    public int solution(int[] A) {
        // write your code in Java SE 8
        int cnt = 0;
        int sum = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0) sum++; // 동쪽으로 가는 차가 나오면 1씩 증가
            else cnt += sum; // 서쪽으로 가는 차를 만났을 때 합을 더해줌
        }

        if (cnt > 1000000000 || cnt < 0) return -1; // 예외 처리

        return cnt;
    }

}
