package main.java.algorithm.Study.a_study;
//https://programmers.co.kr/learn/courses/30/lessons/42747 H-Index

import java.util.Arrays;

public class HIndex {
    static int[] citations = {3, 0, 6, 1, 5};

    public static void main(String[] args) {
        int answer = 0;
        Arrays.sort(citations);  //정렬
        System.out.println(Arrays.toString(citations));

        for (int i = 0; i < citations.length; i++) {
            int h = citations.length - i;
            System.out.println(h + "--");
            if (citations[i] >= h) {  //h가 i 이상이 될 때
                answer = h;
                break;
            }
        }
        System.out.println(answer);
    }

}