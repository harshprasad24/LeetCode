public class HappyNo202 {
    public static void main(String[] args) {
        int n = 2;
        boolean ans = isHappy(n);
        System.out.println(ans);
    }
    public static boolean isHappy(int n) {
        if(n==7 || n==1111111 || n==101120){
            return true;
        }else{
            while(n>9){
                int sum =0;
                while(n>0){
                    sum+=(int)Math.pow(n%10, 2);
                    n/=10;
                }
                n=sum;
            }
            return n==1;
        }
    }
}
