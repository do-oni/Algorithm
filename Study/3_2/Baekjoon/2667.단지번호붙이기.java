//https://www.acmicpc.net/problem/2667

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	static boolean[][] check = new boolean[25][25];
	static int[] aparts = new int[25*25];
	static int apartCnt = 0;
	static int[] dx = {0,0,1,-1};
	static int[] dy = {1,-1,0,0};
	static int[][] map = new int[25][25];
	static int n;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		
		for(int i=0; i<n; i++) {
			String str = br.readLine();
			for(int j=0; j<n; j++) {
				map[i][j] = str.charAt(j) - '0';
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(map[i][j] == 1 && !check[i][j]) {
					apartCnt++;
					dfs(i, j);
				}
			}
		}
		
		Arrays.sort(aparts);
		System.out.println(apartCnt);
		
		for(int i=0; i<aparts.length; i++) {
			if(aparts[i] > 0) System.out.println(aparts[i]);
		}
	}
	
	public static void dfs(int x, int y) {
		check[x][y] = true;
		aparts[apartCnt]++;
		
		for(int i=0; i<4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
		
		if(nx >= 0 && ny >= 0 && nx < n && ny < n) {
			if(map[nx][ny] == 1 && !check[nx][ny]) {
				dfs(nx,ny);
				}
			}
		}
	}
}
