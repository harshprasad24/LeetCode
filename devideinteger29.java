public class devideinteger29 {
    public static void main(String[] args) {
        int dividend = -2147483648, divisor = -1;
        int ans = divide(dividend, divisor);
        System.out.println("The Quotient : " + ans);
    }
    public static  int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        return dividend / divisor;
    }
}
