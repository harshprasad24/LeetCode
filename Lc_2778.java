public class Lc_2778 {
    public static void main(String[] args) {
        int nums[] = {2,7,1,19,18,3};
        System.out.println(sumOfSquares(nums));
    }
    public static int sumOfSquares(int[] nums) {
        int n= nums.length,sum=0;
        for(int i=1;i<=n;i++){
            int product;
            if(n%i==0){
                product=nums[i-1]*nums[i-1];
                sum+=product;
            }
        }
        return sum;
    }
}
