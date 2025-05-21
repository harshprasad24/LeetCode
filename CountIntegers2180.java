public class CountIntegers2180 {
    public static void main(String[] args) {
        int num =30;
        System.out.print(countEven(num));
    }
    public static int countEven(int num) {
        int count=0;
        while(num>0){
            int i=num;
            int sum=0;
            while(i>0){
                int a=i%10;
                sum+=a;
                i/=10;
            }
            if(sum%2==0){
                count++;
            }
            num--;
        }
        return count;
    }
}
