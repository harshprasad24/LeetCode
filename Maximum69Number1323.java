public class Maximum69Number1323 {
    public static int maximum69Number (int num) {
        int ans = 0, a = 1000;
        int changed = 0;
        while (a > 0) {
            int b = num / a;
            num = num % a;
            if (b == 6 && changed == 0) {
                b = 9;
                changed = 1; 
            }
            ans = ans * 10 + b;
            a = a / 10;
        }
        return ans;
        }
        public static void main(String[] args) {
            int num = 9669;
            System.out.println(maximum69Number(num));
        }
}
