package main.java.algorithm.Study.a_study;
//https://www.acmicpc.net/problem/1874 스택 수열

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class B1874 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();

        int n = Integer.parseInt(br.readLine());
        int start = 0;  //오름차순 수열을 위한 변수


        while (n-- > 0) {
            int value = Integer.parseInt(br.readLine());

            if (value > start) {
                //1부터 value값까지 스택에 저장
                for (int i = start + 1; i <= value; i++) {
                    stack.push(i);
                    sb.append('+').append('\n');  //push할 때 + 저장
                }
                start = value;    //다음 push 할 때의 오름차순을 유지하기 위한 변수 초기화
            }

            //맨 위의 값이 다음 value값과 같지 않을 경우
            else if (stack.peek() != value) {
                System.out.println("NO");
                System.exit(0);
            }

            stack.pop();
            sb.append('-').append('\n');  //pop할 때 - 저장

        }

        System.out.println(sb);
    }
}