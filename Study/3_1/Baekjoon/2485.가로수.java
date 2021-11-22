//https://www.acmicpc.net/problem/2485

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int min = Integer.parseInt(st.nextToken());
		int[] location = new int[min];
		int gcd = 0;
		
		//가로수 위치 저장
		for(int i=0; i<min; i++) {
			location[i] = Integer.parseInt(br.readLine());
		}
		
		for(int i=0; i<min-1; i++) {
			
			int gap = location[i+1] - location[i];
			gcd = GCD(gap, gcd);
		}
		System.out.println((location[min-1]-location[0])/gcd+1-(location.length));
	}
		
	//최대 공약수 구하는 메소드
	static int GCD(int a, int b) {
		if(b==0) return a;
		else return GCD(b, a%b);
	}
}
