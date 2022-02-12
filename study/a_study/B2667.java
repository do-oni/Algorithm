package main.java.algorithm.Study.a_study;
//https://www.acmicpc.net/problem/2667 단지번호붙이기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class B2667 {
    static boolean[][] check = new boolean[25][25];
    static int[] aparts = new int[25 * 25];
    static int apartCnt = 0;
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};
    static int[][] map = new int[25][25];
    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < n; j++) {
                map[i][j] = str.charAt(j) - '0';
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] == 1 && !check[i][j]) {
                    apartCnt++;
//					dfs(i, j);
                    bfs(i, j);
                }
            }
        }

        Arrays.sort(aparts);
        System.out.println(apartCnt);

        for (int i = 0; i < aparts.length; i++) {
            if (aparts[i] > 0) System.out.println(aparts[i]);
        }
    }

    public static void dfs(int x, int y) {
        check[x][y] = true;
        aparts[apartCnt]++;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && ny >= 0 && nx < n && ny < n) {
                if (map[nx][ny] == 1 && !check[nx][ny]) {
                    dfs(nx, ny);
                }
            }
        }
    }

    private static void bfs(int x, int y) {
        //2차원 LinkedList를 가진 큐 선언
        Queue<int[]> que = new LinkedList<>();
        que.add(new int[]{x, y});
        check[x][y] = true;
        aparts[apartCnt]++;

        while (!que.isEmpty()) {

            //x, y 값을 받아오기 위한 방법
            int curX = que.peek()[0];
            int curY = que.peek()[1];
            que.poll();

            for (int i = 0; i < 4; i++) {
                int nx = curX + dx[i];
                int ny = curY + dy[i];

                if (nx >= 0 && ny >= 0 && nx < n && ny < n) {
                    if (map[nx][ny] == 1 && !check[nx][ny]) {
                        que.add(new int[]{nx, ny});
                        check[nx][ny] = true;
                        aparts[apartCnt]++;
                    }
                }
            }
        }
    }
}
