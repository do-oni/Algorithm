package main.java.algorithm.Study.a_study;
//https://www.acmicpc.net/problem/15650  N과 M (2)

import java.util.Scanner;

public class B15650 {
    static Scanner sc = new Scanner(System.in);
    static int n = sc.nextInt();
    static int m = sc.nextInt();
    static int[] arr = new int[m];
    static StringBuilder sb = new StringBuilder();

    public static void dfs(int start, int depth) {
        if (depth == m) {
            for (int i : arr) {
                sb.append(i).append(' ');
            }
            sb.append('\n');
            return;
        }

        for (int i = start; i <= n; i++) {
            arr[depth] = i;
            dfs(i + 1, depth + 1);
        }
    }

    public static void main(String[] args) {
        dfs(1, 0);
        System.out.println(sb);
    }
}
