public class SumofPower1780 {
    public static void main(String[] args) {
        int n = 12;
        boolean ans = checkPowersOfThree(n);
        System.out.println(ans);
    }

    public static boolean checkPowersOfThree(int n) {
        while (n > 0) {
            if (n % 3 == 2) return false; 
            n /= 3;
        }
        return true;
    }
}
