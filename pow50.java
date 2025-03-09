public class pow50 {
    public static void main(String[] args) {
        double x=2.100;
        int n =10;
        double ans = myPow(x, n);
        System.out.println(ans);
    }
    public static  double myPow(double x, int n) {
        double ans = Math.pow(x,n);
        return ans;
    }
}
