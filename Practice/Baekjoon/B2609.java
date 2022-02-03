package main.java.algorithm.Practice.Baekjoon;
//acmicpc.net/problem/2609

import java.io.*;
import java.util.StringTokenizer;

public class B2609 {
    public static int gcd(int a, int b) {
        while (b > 0) {
            int tmp = b;
            b = a % b;
            a = tmp;
        }
        return a;
    }

    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int gcd, lcm;
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        gcd = gcd(a, b);
        lcm = lcm(a, b);

        System.out.println(gcd);
        System.out.println(lcm);
    }
}