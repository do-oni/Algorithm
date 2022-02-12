package main.java.algorithm.Study.a_study;
//https://www.acmicpc.net/problem/13305 주유소

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class B13305 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[] dist = new long[n - 1];  //거리
        long[] cost = new long[n];  //주유 비용

        //거리 저장
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n - 1; i++)
            dist[i] = Long.parseLong(st.nextToken());

        //비용 저장
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++)
            cost[i] = Long.parseLong(st.nextToken());

        long sum = 0;
        long minCost = cost[0];

        for (int i = 0; i < n - 1; i++) {
            //이전 주유소가 더 쌀 경우 minCost 갱신
            if (cost[i] < minCost)
                minCost = cost[i];

            sum += (minCost * dist[i]);  //비용 총합
        }
        System.out.println(sum);
    }
}