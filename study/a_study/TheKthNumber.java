package main.java.algorithm.Study.a_study;
//https://programmers.co.kr/learn/courses/30/lessons/42748

import java.util.Arrays;

public class TheKthNumber {
    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};  //첫번째 숫자부터 두번째 숫자까지 잘랐을때 정렬 후 세번째 숫자 구하기
        int[] answer = new int[commands.length];
        System.out.println(commands[1][0] - 1);

        for (int i = 0; i < answer.length; i++) {
            int[] temp = new int[commands[i][1] - (commands[i][0] - 1)];  //잘랐을때의 크기만큼 temp 배열 생성

            for (int j = 0; j < temp.length; j++) {
                temp[j] = array[j + (commands[i][0] - 1)];
                System.out.println(commands[i][0] - 1);
            }
            Arrays.sort(temp);
            answer[i] = temp[commands[i][2] - 1];
        }
        System.out.println(Arrays.toString(answer));
    }
}