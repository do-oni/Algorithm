import java.io.*;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		int num = Integer.parseInt(br.readLine());
 
		int[] answer = new int[num + 1];
		int[] step = new int[num + 1];
 
 
		for (int i = 1; i <= num; i++) {
			step[i] = Integer.parseInt(br.readLine());
		}

		answer[1] = step[1];
		
		// N 이 1이 입력될 수도 있기 때문에 예외처리를 해줄 필요가 있다.
		if (num >= 2) {
			answer[2] = step[1] + step[2];
		}
 
		for (int i = 3; i <= num; i++) {
			answer[i] = Math.max(answer[i - 2] , answer[i - 3] + step[i - 1]) + step[i];
		}
 
		System.out.println(answer[num]);
 
	}
}
