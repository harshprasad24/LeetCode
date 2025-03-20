public class powerOftwo231 {
    public static void main(String[] args) {
        int n=1;
        boolean ans = isPowerOfTwo(n);
        System.out.println(ans);
    }
    public static boolean isPowerOfTwo(int n) {
        int a =0,i=0;
        if(n==2147483647){
            return false;
        }
        while(n>=a){
            a=(int)Math.pow(2, i);
            i++;  
            if(n==a){
                return true;
            }
        }
        return false;
    }
}
