package main.java.algorithm.Study.linkedlist_tree;
//https://programmers.co.kr/learn/courses/30/lessons/42626

import java.util.PriorityQueue;

public class MoreSpicy {

    public static void main(String[] args) {
        int[] scoville = {1, 2, 3, 9, 10, 12};
        int K = 7;

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int answer = 0;

        for (int i : scoville) {  //스코빌 지수를 우선순위큐에 담기
            pq.add(i);
        }

        while (pq.peek() <= K) {  //pq의 가장 작은 값이 K지수보다 작을 동안
            if (pq.size() == 1) {  //pq의 길이가 1이라면 두 지수를 섞을 수 없으니 -1 반환
//                return -1;
                System.out.println(-1);
            }
            int first = pq.poll();  //첫번째로 작은 수
            int second = pq.poll();  //두번째로 작은 수

            int k = first + (second * 2);  //K지수 만들기
            answer++;  //한번 만들때마다 answer 증가
        }

//        return answer;
        System.out.println(answer);
    }
}
