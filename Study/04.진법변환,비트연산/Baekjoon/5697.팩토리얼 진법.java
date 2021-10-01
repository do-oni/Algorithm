import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = i < 2 ? 1 : arr[i - 1] * i;
        }

        while (true) {
            int num = sc.nextInt();
            int decimalNum = 0;
            if (num == 0)
                break;
            for (int i = 1; num > 0; i++, num /= 10) {
                int temp = num % 10;
                decimalNum += arr[i] * temp;
            }
            System.out.println(decimalNum);
    }
}
}
