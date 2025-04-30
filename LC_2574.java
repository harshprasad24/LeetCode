public class LC_2574 {
    public static int[] leftRightDifference(int[] nums){
        int n = nums.length;
        int[] Prefix = new int[n];
        int[] Sufix = new int[n];
        for (int i = 1; i < n ; i++) {
            Prefix[i] = Prefix[i - 1] + nums[i-1];
        }
        for (int i = n - 2; i >= 0; i--) {
            Sufix[i] = Sufix[i + 1] + nums[i + 1];
        }
        int ans [] = new int [n];
        for(int i = 0 ; i < n ; i++){
            ans[i]=Math.abs(Sufix[i]-Prefix[i]);
        }
        return ans;
    }
    public static void main(String[] args) {
        int nums[] = {10,4,8,3};
        int ans[]= leftRightDifference(nums);
        for(int i=0;i<nums.length;i++){
            System.out.println(ans[i]); 
        }
    }
}
