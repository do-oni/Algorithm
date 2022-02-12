package main.java.algorithm.practice.Baekjoon;
//https://www.acmicpc.net/problem/15649

import java.io.*;
import java.util.StringTokenizer;

public class B15649 {
    static int n, m;
    static int[] arr;
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[m];
        visited = new boolean[n];

        dfs(0);
        System.out.println(sb);
    }

    public static void dfs(int depth) {
        if (depth == m) {
            for (int n : arr) {
                sb.append(n).append(' ');
            }
            sb.append('\n');
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                arr[depth] = i + 1;
                dfs(depth + 1);
                visited[i] = false;
            }
        }
    }
}