package main.java.algorithm.Study.convertnotation_bitwiseoperation;
//https://www.acmicpc.net/problem/2745

import java.util.Scanner;

public class B2745 {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int b = sc.nextInt();
        int length = s.length();
        int decimalNum = 0;
        int num = 0;

        for (int i = 0; i < length; i++) {  //A : 65, 0 : 48
            if (s.charAt(i) >= 65) {
                num = s.charAt(i) - 55;  //문자열은 10~35로
            } else {
                num = s.charAt(i) - 48;  //숫자는 0~9로
            }
            int n = (int) Math.pow(b, length - i - 1);  //10억 이하인 int로 형변환
            decimalNum += n * num;  //10진법 계산
        }
        System.out.println(decimalNum);
    }
}