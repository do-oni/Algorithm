//https://www.acmicpc.net/problem/1541

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int sum = Integer.MAX_VALUE;
		StringTokenizer subtract = new StringTokenizer(br.readLine(), "-");
		
		while(subtract.hasMoreTokens()) {
			int temp = 0;
			StringTokenizer add = new StringTokenizer(subtract.nextToken(), "+");
			
			while(add.hasMoreTokens()) temp += Integer.parseInt(add.nextToken());
			
			if(sum == Integer.MAX_VALUE) sum = temp;
			else sum -= temp;
		}
		System.out.println(sum);
	}
}
