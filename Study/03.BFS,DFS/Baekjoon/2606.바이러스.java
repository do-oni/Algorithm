import java.util.Scanner;

public class Main {
    static int[][] computer;
    static boolean[] virus;
    static int num, linked, virusCnt;

    
    public static void dfs(int i) {
        virus[i] = true;
        
        for(int j = 1; j <= num; j++) {
            if(computer[i][j] == 1 && !virus[j]) {
                dfs(j);
                virusCnt++;
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        linked = sc.nextInt();
        
        computer = new int[num+1][num+1];
        virus = new boolean[num+1];
        
        for(int i = 0; i < linked; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            computer[x][y] = computer[y][x] = 1;
        }

        for(boolean b : virus) {
            if(b) {
                virusCnt++;
            }
        }
        
        dfs(1);
        System.out.println(virusCnt);
    }
}
