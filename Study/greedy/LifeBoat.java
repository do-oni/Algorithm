package main.java.algorithm.Study.greedy;
//https://programmers.co.kr/learn/courses/30/lessons/42885

import java.util.Arrays;

public class LifeBoat {

    public int solution(int[] people, int limit) {
        int answer = 0;
        int max = people.length - 1;  //최대 무게 접근 하기 위한 변수
        Arrays.sort(people);  //오름차순 정렬

        for (int i = 0; i <= max; i++) {
            while (i < max && people[i] + people[max--] > limit) {
                answer++;
            }
            answer++;
        }
        return answer;
    }
}
