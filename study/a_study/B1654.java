package main.java.algorithm.Study.a_study;
//https://www.acmicpc.net/problem/1654 랜선 자르기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1654 {
	/*
	4 11
	802
	743
	457
	539
	 */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int k = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int[] arr = new int[k];
        long max = 0;

        for (int i = 0; i < k; i++) {
            arr[i] = Integer.parseInt(br.readLine());

            if (max < arr[i]) max = arr[i];  //최대 랜선 길이 저장
        }

        max++;  //max +1 값이어야 함

        long min = 0;
        long mid = 0;

        while (min < max) {
            mid = (max + min) / 2;  //중간 길이 값

            long count = 0;  //중간 길이로 잘라서 구해지는 총 랜선 개수 저장

            for (int i = 0; i < arr.length; i++)
                count += (arr[i] / mid);

            //mid 길이로 잘랐을 때 개수가 n개 보다 작을 때 자르는 길이를 줄이기 위해 최대 길이를 줄여주고
            //더 많을 때는 최소 길이를 늘려준다.
            if (count < n) max = mid;
            else min = mid + 1;
        }

        System.out.println(min - 1);  //-1을 해준 값이 최대 길이
    }

}