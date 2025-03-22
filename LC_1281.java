public class LC_1281 {
    public static void main(String[] args) {
        int n = 234;
        int ans = subtractProductAndSum(n);
        System.out.print(ans);
    }
    public static int subtractProductAndSum(int n) {
        int sum=0,pro=1;   
        while(n>0){
            int a = n%10;
            sum+=a;
            pro*=a;
            n/=10;
        }
        return pro-sum;
    }
}
