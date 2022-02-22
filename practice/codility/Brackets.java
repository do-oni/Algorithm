package main.java.algorithm.practice.codility;

import java.util.Stack;

public class Brackets {

    // Performance 20
    // Correctness 0
    public static int solution1(String S) {
        // write your code in Java SE 8
        Stack<Character> stack = new Stack<>();

        if (S.length() < 2) return 0;

        for (int i = 0; i < S.length(); i++) {
            switch (S.charAt(i)) {
                case ')':
                    if (!stack.isEmpty())
                        if (stack.peek() == '(') stack.pop();
                    break;
                case ']':
                    if (!stack.isEmpty())
                        if (stack.peek() == '[') stack.pop();
                    break;
                case '}':
                    if (!stack.isEmpty())
                        if (stack.peek() == '{') stack.pop();
                    break;
                default:
                    stack.push(S.charAt(i));
                    break;
            }
            if (stack.isEmpty()) return 1;
        }
        return 0;
    }

    // Performance 100
    // Correctness 100
    // O(N)
    public static int solution(String S) {
        // write your code in Java SE 8
        Stack<Character> stack = new Stack<>();

        if (S.length() == 0) return 1;
        else if (S.length() % 2 != 0) return 0;

        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);

            if (c == '(' || c == '[' || c == '{') stack.push(c);
            else {
                if (stack.isEmpty()) return 0;
                
                char temp = stack.pop();

                if ((temp == '(' && c != ')') || (temp == '{' && c != '}') || (temp == '[' && c != ']')) return 0;
            }
        }
        if (stack.isEmpty()) return 1;

        return 0;
    }

}
