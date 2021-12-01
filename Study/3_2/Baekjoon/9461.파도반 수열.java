//https://www.acmicpc.net/problem/9461

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static Long[] seq = new Long[101];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		seq[0] = 0L;
		seq[1] = 1L;
		seq[2] = 1L;
		seq[3] = 1L;
		
		int t = Integer.parseInt(br.readLine());
		
		while(t-- > 0) {
			sb.append(padovan(Integer.parseInt(br.readLine()))).append('\n');
		}
		
		System.out.println(sb);
	}
	
	public static long padovan(int n) {
		if(seq[n] == null) seq[n] = padovan(n - 2) + padovan(n - 3);
		
		return seq[n];
	}
}
