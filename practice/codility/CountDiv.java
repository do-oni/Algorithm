package main.java.algorithm.practice.codility;

public class CountDiv {

    // Performance 50
    // O(B-A)
    public int solution1(int A, int B, int K) {
        // write your code in Java SE 8
        int cnt = 0;

        for (int i = A; i <= B; i++) {
            if (i % K == 0) {
                cnt++;
            } else {
                continue;
            }
        }
        return cnt;
    }

    // Performance 100
    // O(1)
    public int solution2(int A, int B, int K) {
        // write your code in Java SE 8
        int cnt = (B / K) - (A / K);

        if (A % K == 0) cnt += 1;

        return cnt;
    }

}
