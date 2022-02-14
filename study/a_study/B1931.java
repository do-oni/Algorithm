package main.java.algorithm.study.a_study;
//https://www.acmicpc.net/problem/1931 회의실 배정

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class B1931 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] time = new int[n][2];
        StringTokenizer st;
        int current = 0;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            time[i][0] = Integer.parseInt(st.nextToken());
            time[i][1] = Integer.parseInt(st.nextToken());
        }

        // 끝나는 시간 기준으로 정렬하기 위해 compare 재정의
        Arrays.sort(time, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1] == o2[1]) { // 종료 시간이 같을 경우 시작 시간이 빠른순
                    return o1[0] - o2[0];
                }
                return o1[1] - o2[1];
            }
        });

        int cnt = 0;
        int prevEnd = 0;

        for (int i = 0; i < n; i++) {
            if (prevEnd <= time[i][0]) {
                prevEnd = time[i][1];
                cnt++;
            }
        }

        System.out.println(cnt);
    }

}
