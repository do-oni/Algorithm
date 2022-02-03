package main.java.algorithm.Study.a_study;
//https://www.acmicpc.net/problem/1541 잃어버린 괄호

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1541 {
    //case1 - 55-50+40
    //case2 - 10+20+30+40
    //case3 - 00009-00009

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = Integer.MAX_VALUE;
//		System.out.println(sum + "--1");

        //가장 큰 값을 빼줄 때 가장 작은 값이 됨
        StringTokenizer subtract = new StringTokenizer(br.readLine(), "-");  //뺄셈기호 기준 먼저 분리

        while (subtract.hasMoreTokens()) {
            int temp = 0;
            StringTokenizer add = new StringTokenizer(subtract.nextToken(), "+");  //덧셈기호 기준 분리

            while (add.hasMoreTokens())
                temp += Integer.parseInt(add.nextToken());  //덧셈기호 기준 분리 된 수들을 더해줌
//			System.out.println(temp + "--2");

            if (sum == Integer.MAX_VALUE) sum = temp;
            else sum -= temp;
        }
        System.out.println(sum);
    }
}
