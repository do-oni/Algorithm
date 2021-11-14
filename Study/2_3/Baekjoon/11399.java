//https://www.acmicpc.net/problem/11399 ATM

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ATM {
	
	/*
	5
	3 1 4 3 2
	*/
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int peopleNum = Integer.parseInt(br.readLine());
		int[] arr = new int[1001];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		//Counting sort
		while(peopleNum-- > 0) {
			arr[Integer.parseInt(st.nextToken())]++;
		}
		
		int prev = 0;  //대기시간 누적합
		int sum = 0;  //대기시간 총합
		
		for(int i=0; i<arr.length; i++) {
			while(arr[i]-- > 0) {
				sum += (i + prev);
//				System.out.println(sum + "s");
				prev += i;
//				System.out.println(prev + "p");
			}
		}
		System.out.println(sum);
	}
}
