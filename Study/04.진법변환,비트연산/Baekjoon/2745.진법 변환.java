import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int b = sc.nextInt();
        int length = s.length();
        int decimalNum = 0;
        int num = 0;
        
        for(int i = 0; i < length; i++) {
            if(s.charAt(i) >= 65) {
                num = s.charAt(i) - 55;
            }else {
                num = s.charAt(i) - 48;
            }
            int n = (int)Math.pow(b, length - i - 1);
            decimalNum += n * num;
        }
        System.out.println(decimalNum);
    }
}
