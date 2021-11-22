//https://www.acmicpc.net/problem/1406

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		Stack<String> left = new Stack<String>();
		Stack<String> right = new Stack<String>();
		String[] arr = str.split("");
		
		for(String s : arr) left.push(s);
		
		st = new StringTokenizer(br.readLine());
		int m = Integer.parseInt(st.nextToken());
		
		for(int i=0; i<m; i++) {
			String command = br.readLine();
			char c = command.charAt(0);
			
			switch(c) {
			case 'L':
				if(!left.isEmpty()) right.push(left.pop());
				break;
			case 'D':
				if(!right.isEmpty()) left.push(right.pop());
				break;
			case 'B':
				if(!left.isEmpty()) left.pop();
				break;
			case 'P':
				char t = command.charAt(2);
				left.push(String.valueOf(t));
				break;
			default:
				break;
			}
		}
		
		while(!left.isEmpty()) right.push(left.pop());
		while(!right.isEmpty()) sb.append(right.pop());
		
		System.out.println(sb);
	}
}
