public class FascinatingNO2729 {
    public static boolean isFascinating(int n) {
        boolean[] seen = new boolean[10];
        int count = 0, twice = 2 * n, thrice = 3 * n;
        
        while (n > 0) {
            int digit = n % 10;
            if (digit == 0 || seen[digit]) return false;
            seen[digit] = true;
            n /= 10;
            count++;
        }
        while (twice > 0) {
            int digit = twice % 10;
            if (digit == 0 || seen[digit]) return false;
            seen[digit] = true;
            twice /= 10;
            count++;
        }
        while (thrice > 0) {
            int digit = thrice % 10;
            if (digit == 0 || seen[digit]) return false;
            seen[digit] = true;
            thrice /= 10;
            count++;
        }
        
        return count == 9; 
    }
    public static void main(String[] args) {
        int n =192;
        System.out.println(isFascinating(n));
    }
}
