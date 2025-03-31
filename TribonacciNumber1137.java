public class TribonacciNumber1137 {
    public static void main(String[] args) {
        int n=37;
        System.out.print(tribonacci(n));
    }
    public static int tribonacci(int n) {
        int t0=0,t1=1,t2=1,sum=0;
        if(n==1) return t1;
        if(n==2) return t0+t1;
        while(n>=3){
            sum = t0+t1+t2;
            t0=t1;
            t1=t2;
            t2=sum;
            n-=1;
        }
        return sum;
    }
}
