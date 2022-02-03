package main.java.algorithm.Study.dp;
//https://www.acmicpc.net/problem/2579

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StairClimbing {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        int[] answer = new int[num + 1]; // 최고 점수 배열
        int[] step = new int[num + 1]; // 계단 점수 배열

        // 계단 점수를 step 배열에 저장
        for (int i = 1; i <= num; i++) {
            step[i] = Integer.parseInt(br.readLine());
        }

        // 시작점 초기화
        answer[1] = step[1];

        // num이 1일 경우의 수 예외 처리
        if (num >= 2) {
            answer[2] = step[1] + step[2];
        }

        // 최댓값 구하기
        for (int i = 3; i <= num; i++) {
            answer[i] = Math.max(answer[i - 2], answer[i - 3] + step[i - 1]) + step[i];
        }

        System.out.println(answer[num]);

    }
}
