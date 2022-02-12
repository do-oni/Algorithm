package main.java.algorithm.Study.bruteforce_binarysearch;
//https://www.acmicpc.net/problem/10816

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B10816 {
    static final int maxNum = 10000000;

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = 0;
        try {
            cnt = Integer.valueOf(br.readLine());
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        int[] cardN = new int[(maxNum * 2) + 1];
        StringTokenizer st = null;
        try {
            st = new StringTokenizer(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < cnt; i++) {
            cardN[Integer.valueOf(st.nextToken()) + maxNum]++;
        }
        try {
            cnt = Integer.valueOf(br.readLine());
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            st = new StringTokenizer(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < cnt; i++) {
            sb.append(cardN[Integer.valueOf(st.nextToken()) + maxNum] + " ");
        }
        System.out.println(sb.toString());
    }
}

