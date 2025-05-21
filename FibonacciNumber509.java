public class FibonacciNumber509 {
    public static int fib(int n) {
        if (n == 0) return 0;    
        if (n == 1) return 1;      
        return fib(n - 1) + fib(n - 2);
    }
    public static void main(String[] args) {
        int n=6;
        System.out.println(fib(n));
    }
}
