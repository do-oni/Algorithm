import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    static int[][] dest;
    static boolean[] visited;
    static int n;
    static int m;
    static int v;
    
    public static void dfs(int i) {
        visited[i] = true;
        System.out.print(i + " ");
        
        for(int j = 1; j <= n; j++) {
            if(dest[i][j] == 1 && visited[j] == false) {
                dfs(j);
            }
        }
    }
    
    public static void bfs() {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.offer(v);
        visited[v] = true;
        System.out.print(v + " ");
        
        while(!queue.isEmpty()) {
            int now = queue.poll();
            
            for(int j = 1; j <= n; j++) {
                if(dest[now][j] == 1 && visited[j] == false) {
                    queue.offer(j);
                    visited[j] = true;
                    System.out.print(j + " ");
                }
            }
        }
    }
    
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        v = sc.nextInt();
        
        dest = new int[1001][1001];
        visited = new boolean[1001];
        
        for(int i = 0; i < m; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            dest[x][y] = dest[y][x] = 1;
        }
        
        dfs(v);
        visited = new boolean[1001];
        System.out.println();
        bfs();
    }
}
