public class ClumsyFactorial1006 {
    public static void main(String[] args) {
        int n=10;
        System.out.print(clumsy(n));
    }
    public static int clumsy(int n) {
        if(n==1) return 1; 
        if(n==2) return n*(n-1) ; 
        if(n==3) return n*(n-1)/(n-2)+(n-3) ;
        if(n==4) return n*(n-1)/(n-2)+(n-3)-(n-4) ;
        int ans = n * (n - 1) / (n - 2) + (n - 3);
        n -= 4;
        
        while (n >= 4) {
            ans -= (n * (n - 1) / (n - 2));
            ans += (n - 3);
            n -= 4;
        }

        if (n == 3) ans -= (3 * 2 / 1);
        else if (n == 2) ans -= (2 * 1);
        else if (n == 1) ans -= 1;
        return ans;
    }
}
