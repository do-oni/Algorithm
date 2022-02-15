package main.java.algorithm.practice.codility;

public class FrogJmp {

    public int solution(int X, int Y, int D) {
        // write your code in Java SE 8
        double cnt = (Y - X) * 1.0 / D; // 자동 형변환

        return (int) Math.ceil(cnt);
    }

}
