package main.java.algorithm.Study.linkedlist_tree;
//https://programmers.co.kr/learn/courses/30/lessons/42628

import java.util.Collections;
import java.util.PriorityQueue;

public class DoublePriorityQueue {

    public static void main(String[] args) {
        String[] operations = {"I 16", "D 1"};  //case1
//    	String[] operations = {"I 7","I 5","I -5","D -1"};  //case2
        int[] answer = new int[2];

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        PriorityQueue<Integer> maxPq = new PriorityQueue<>(Collections.reverseOrder());

        for (String s : operations) {

            if (s.substring(0, 1).equals("I")) {  //첫번째 문자열 확인
                int value = Integer.valueOf(s.substring(2));  //I 숫자를 value에 저장
                pq.offer(value);
                maxPq.offer(value);
            }
            // 값이 있을 때
            else if (!pq.isEmpty()) {
                // 최대값 삭제
                if (s.equals("D 1")) {
                    int value = maxPq.poll();
                    pq.remove(value);
                }
                // 최소값 삭제
                else if (s.equals("D -1")) {
                    int value = pq.poll();
                    maxPq.remove(value);
                }
            }
        }

        // 값이 있을 때
        if (!pq.isEmpty()) {
            answer[0] = maxPq.peek();
            answer[1] = pq.peek();
        }

//        return answer;
        System.out.println(answer);
    }
}
