package main.java.algorithm.Study.stack_queue;

import java.util.Stack;

public class StockPrice {
    public int[] solution(int[] prices) {
        Stack<Integer> stack = new Stack<Integer>();
        int[] answer = new int[prices.length];

        for (int i = 0; i < prices.length; i++) {
            while (!stack.empty() && prices[stack.peek()] > prices[i]) {
                int time = stack.pop();
                answer[time] = i - time;
            }
            stack.push(i);
        }
        while (!stack.empty()) {
            int time = stack.pop();
            answer[time] = (prices.length - 1) - time;
        }
        return answer;
    }
}