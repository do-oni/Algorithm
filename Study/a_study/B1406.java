package main.java.algorithm.Study.a_study;
//https://www.acmicpc.net/problem/1406 에디터

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class B1406 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();

        Stack<String> left = new Stack<String>();
        Stack<String> right = new Stack<String>();
        String[] arr = str.split("");  //맨 뒤에서 시작

        for (String s : arr) left.push(s);

        st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());

        for (int i = 0; i < m; i++) {
            String command = br.readLine();
            char c = command.charAt(0);

            switch (c) {
                case 'L':
                    if (!left.isEmpty()) right.push(left.pop());
                    break;
                case 'D':
                    if (!right.isEmpty()) left.push(right.pop());
                    break;
                case 'B':
                    if (!left.isEmpty()) left.pop();
                    break;
                case 'P':
                    char t = command.charAt(2);
                    left.push(String.valueOf(t));
                    break;
                default:
                    break;
            }
        }

        //역순으로 되어있는 왼쪽 스택의 데이터들을 오른쪽으로 옮긴 뒤 출력
        while (!left.isEmpty()) right.push(left.pop());
        while (!right.isEmpty()) sb.append(right.pop());

        System.out.println(sb);
    }
}