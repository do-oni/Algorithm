package main.java.algorithm.Study.a_study;
//https://www.acmicpc.net/problem/11047 동전 0

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;


public class B11047 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        Integer[] value = new Integer[n];
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            value[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(value, Collections.reverseOrder());

        for (int i = 0; i < n; i++) {
            if (value[i] <= k) {
                cnt += (k / value[i]);
                k %= value[i];
            } else continue;
        }

        System.out.println(cnt);
    }
}