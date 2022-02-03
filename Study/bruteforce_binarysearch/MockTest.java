package main.java.algorithm.Study.bruteforce_binarysearch;
//https://programmers.co.kr/learn/courses/30/lessons/42840

import java.util.ArrayList;

public class MockTest {

    public int[] solution(int[] answers) {
        int[] one = {1, 2, 3, 4, 5};
        int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] score = new int[3];

        for (int i = 0; i < answers.length; i++) {
            if (one[i % 5] == answers[i])
                score[0]++;
            if (two[i % 8] == answers[i])
                score[1]++;
            if (three[i % 10] == answers[i])
                score[2]++;
        }

        int max = Math.max(Math.max(score[0], score[1]), score[2]);
        ArrayList<Integer> list = new ArrayList<>();

        if (max == score[0])
            list.add(1);
        if (max == score[1])
            list.add(2);
        if (max == score[2])
            list.add(3);

        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}

