package main.java.algorithm.practice.codility;

public class BinaryGap {

    public int solution(int N) {
        // write your code in Java SE 8
        String binary = Integer.toBinaryString(N);
        String[] check = binary.split("");
        int gap = 0;
        int current = 0;

        for (String s : check) {
            if (s.equals("0")) {
                current++;
            } else {
                gap = Math.max(gap, current);
                current = 0;
            }
        }

        return gap;
    }

}