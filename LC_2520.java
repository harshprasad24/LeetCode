public class LC_2520 {
    public static void main(String[] args) {
        int num = 7;
        System.out.println(countDigits(num));
    }
    public static int countDigits(int num) {
        int temp=num,count=0;
        while(temp>0){
            int a =temp%10;
            if(num%a==0){
                count++;
            }
        temp/=10;
        }
        return count;
    }
}
