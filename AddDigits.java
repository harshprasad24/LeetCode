public class AddDigits {
    public static void main(String[] args) {
        int num =190;
        int ans = add_Digits(num);
        System.out.print(ans);
    }
    public static int add_Digits(int num){
        while (num > 9) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }
}
