package main.java.algorithm.practice.codility;

import java.util.Stack;

public class Fish {

    // Performance 0
    // Correctness 0
    public int solution1(int[] A, int[] B) {
        // write your code in Java SE 8
        Stack<Integer> aStack = new Stack();
        Stack<Integer> bStack = new Stack();
        int alive = 0;

        for (int i = B.length - 1; i >= 0; --i) {
            aStack.push(A[i]);
            bStack.push(B[i]);
        }

        while (!aStack.isEmpty()) {
            int bPop = bStack.pop();

            if (bPop != 0) {
                int aPop = aStack.pop();

                if (aPop > aStack.peek()) {
                    aStack.pop();
                    bStack.pop();
                    aStack.push(aPop);
                    bStack.push(bPop);
                } else {
                    aStack.pop();
                    bStack.pop();
                    alive++;
                }
            } else {
                alive++;
                aStack.pop();
            }
        }
        return alive;
    }

    // Performance 100
    // Correctness 100
    // O(N)
    public int solution2(int[] A, int[] B) {
        // write your code in Java SE 8
        Stack<Integer> down = new Stack<>();
        int up = 0;

        for (int i = 0; i < B.length; i++) {
            if (B[i] == 1) {
                down.push(A[i]);
            } else {
                while (!down.isEmpty()) {
                    if (A[i] > down.peek()) {
                        down.pop();
                    } else break;
                }
                if (down.isEmpty()) {
                    up++;
                }
            }
        }
        return down.size() + up;
    }

}
