package main.java.algorithm.Study.convertnotation_bitwiseoperation;
//https://programmers.co.kr/learn/courses/30/lessons/17681

public class SecretMap {
    public String[] solution(int n, int[] arr1, int[] arr2) {

        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            answer[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
            answer[i] = String.format("%" + n + "s", answer[i]);
            answer[i] = answer[i].replaceAll("[1]", "#");
            answer[i] = answer[i].replaceAll("[0]", " ");
        }

        return answer;
    }
}