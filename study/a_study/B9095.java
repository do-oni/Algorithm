package main.java.algorithm.Study.a_study;
//https://www.acmicpc.net/problem/9095 1,2,3 더하기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B9095 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[11];

        //경우의 수 개수 저장
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;

        for (int i = 4; i <= 10; i++)
            dp[i] = dp[i - 3] + dp[i - 2] + dp[i - 1];

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());

            System.out.println(dp[num]);
        }
    }
}
