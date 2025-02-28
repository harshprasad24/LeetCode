import java.util.Scanner;

public class ReverseInteger7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int x = sc.nextInt();
        int y = reverse(x);

        System.out.println("The output is: " + y);
    }

    public static int reverse(int x) {
        int reverse = 0;
        int a = Integer.MAX_VALUE;
        int b = Integer.MIN_VALUE;
        while (x != 0) {
            int digit = x % 10;
            if (reverse > a/ 10 || (reverse ==a/ 10 && digit > 7)) {
                return 0;
            }
            if (reverse < b/ 10 || (reverse == b/ 10 && digit < -8)) {
                return 0;
            }
            reverse = reverse * 10 + digit;
            x /= 10;
        }
        return reverse;
    }
}
