import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int time = sc.nextInt();
        int a = 0;
        int b = 0;
        int c = 0;
        
        while(time >= 10) {
            if(time>=300) {
                time -= 300;
                a++;
            }else if(time>=60) {
                time -= 60;
                b++;
            }else if(time>=10) {
                time -= 10;
                c++;
            }
        }
            System.out.println(time == 0 ? a+" "+b+" "+c : -1);
        
    }
}
