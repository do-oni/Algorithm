//재귀
import java.io.*;

public class Main {
    
    public static int factorial(int n) {
        if(n <= 1) {
            return 1;
        }else {
            return n * factorial(n-1);
            }
        }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int answer = factorial(n);
        System.out.println(answer);
    }
}​


//반복문
import java.io.*;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int answer = 1;
        
        while(n != 0) {
            answer = answer * n;
            n--;
        }
        System.out.println(answer);
    }
}
