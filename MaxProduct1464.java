public class MaxProduct1464 {
    public static void main(String[] args) {
        int nums[] = {3,7};
        int result = maxProduct(nums);
        System.out.println(result);
    }
    public static int maxProduct(int[] nums) {
        int ans , sum = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                ans=(nums[i]-1)*(nums[j]-1) ;
                if(ans>sum){
                    sum=ans;
                }
            }
        }
        return sum;
    }
}
