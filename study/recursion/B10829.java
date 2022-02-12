package main.java.algorithm.Study.recursion;
//https://www.acmicpc.net/problem/10829

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10829 {

    static String s = "";

    public static void convertBinary(long n) {
        if (n <= 1) {
            s += String.valueOf(n);
        } else {
            s += String.valueOf(n % 2);
            n = n / 2;
            convertBinary(n);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        convertBinary(n);
        StringBuilder sb = new StringBuilder(s);
        s = sb.reverse().toString();
        System.out.println(s);
    }
}
