public class HarshadNumber3099 {
    public static int sumOfTheDigitsOfHarshadNumber(int x) {
        int n =x,sum=0;
        while(x>0){
            int a = x%10;
            sum += a;
            x/=10;
        }
        if(n%sum==0) return sum;
        return -1;
    }
    public static void main(String[] args) {
        int x=18;
        System.out.println(sumOfTheDigitsOfHarshadNumber(x));
    }
}
