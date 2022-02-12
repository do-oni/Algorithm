package main.java.algorithm.Study.a_study;
//https://programmers.co.kr/learn/courses/30/lessons/43162 네트워크

import java.util.Arrays;

public class Network {
    static int n = 3;
    static int[][] computers = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};

    public static void main(String[] args) {
        int answer = 0;
        boolean[] visited = new boolean[n];  //n 갯수만큼 방문 체크 배열 선언

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {  //방문하지 않았을 때 dfs 호출
                dfs(computers, i, visited);
                answer++;
            }
        }
        System.out.println(answer);
    }

    static boolean[] dfs(int[][] computers, int n, boolean[] visited) {
        visited[n] = true;

        for (int i = 0; i < computers.length; i++) {
            if (computers[n][i] == 1 && visited[i] == false)
                visited = dfs(computers, i, visited);
            System.out.println(Arrays.toString(visited));

        }
        return visited;
    }

}

