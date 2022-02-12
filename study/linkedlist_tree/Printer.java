package main.java.algorithm.Study.linkedlist_tree;
//https://programmers.co.kr/learn/courses/30/lessons/42587

import java.util.Collections;
import java.util.PriorityQueue;

public class Printer {

    public static void main(String[] args) {
        int[] priorities = {2, 1, 3, 2};  //case1
//		int[] priorities = {1,1,9,1,1,1};  //case2
        int location = 2;  //case1
//		int location = 0;  //case2
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int i : priorities) {  //중요도 배열을 우선순위 큐에 담기 [3,2,2,1]
            pq.add(i);
        }
        System.out.println(pq.peek());

        while (!pq.isEmpty()) {
            for (int i = 0; i < priorities.length; i++) {
                if (priorities[i] == pq.peek()) {  //중요도의 값이 우선순위큐의 가장 큰 값과 같을 때
                    if (i == location) {  //대기목록과 같다면
                        answer++;  //answer 증가
//	                    return answer;
                        System.out.println(answer);
                    }
                    pq.poll();  //대기목록이 아닐때 먼저 처리
                    answer++;  //answer 증가
                }
            }
        }
//	    return answer;
        System.out.println(answer);
    }
}

