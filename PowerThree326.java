public class PowerThree326 {
    public static void main(String[] args) {
        int n= 24;
        System.out.println(isPowerOfThree(n));
    }

    public static boolean isPowerOfThree(int n) {
        if(n==1)
            return true;
        if(n<1 || n%3!=0)
            return false;
        return isPowerOfThree(n/3);
    }
}
