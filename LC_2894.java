public class LC_2894 {
    public static void main(String[] args) {
        int n = 5, m = 6;
        System.out.print(differenceOfSums(n, m));
    }
    public static int differenceOfSums(int n, int m) {
        int num1[] = new int[n];
        int num2[] = new int[n];
        int k=0,a=0;
        for(int i=1;i<=n;i++){
            if(i%m==0){
                num2[k++]=i;
            }else{
                num1[a++]=i;
            }
        }
        int sum1=0,sum2=0;
        for(int i=0;i<num1.length;i++){
            sum1+=num1[i];
        }
        for(int i=0;i<num2.length;i++){
            sum2+=num2[i];
        }
        return sum1 - sum2;
    }
}
