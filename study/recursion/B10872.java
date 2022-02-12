package main.java.algorithm.Study.recursion;
//https://www.acmicpc.net/problem/10872

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10872 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int answer = 1;

        while (n != 0) {
            answer = answer * n;
            n--;
        }
        System.out.println(answer);
    }
}