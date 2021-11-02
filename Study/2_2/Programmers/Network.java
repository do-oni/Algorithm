//https://programmers.co.kr/learn/courses/30/lessons/43162

class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] visited = new boolean[n];  
        
        for(int i=0; i<n; i++) {
            if(!visited[i]) {
                dfs(computers, i, visited);
                answer++;
            }
        }
        return answer;
    }
    
    boolean[] dfs(int[][] computers, int n, boolean[] visited) {
        visited[n] = true;
        
        for(int i=0; i<computers.length; i++) {
            if(i != n && computers[n][i] == 1 && visited[i] == false)
              visited = dfs(computers, i, visited);
        }
        return visited;
    }
}
