public class LC_2874 {
    public static long maximumTripletValue(int[] nums) {
        int n = nums.length;
                long ans = 0;
                int[] suffixMax = new int[n];
                suffixMax[n - 1] = nums[n - 1];
        
                // Precompute the maximum element from right to left
                for (int i = n - 2; i >= 0; i--) {
                    suffixMax[i] = Math.max(nums[i], suffixMax[i + 1]);
                }
        
                int maxLeft = nums[0];
        
                for (int j = 1; j < n - 1; j++) {
                    long value = (long)(maxLeft - nums[j]) * suffixMax[j + 1];
                    ans = Math.max(ans, value);
                    maxLeft = Math.max(maxLeft, nums[j]);
                }
        
                return ans;
    }
    
    public static void main(String[] args) {
        int nums[] = {12,6,1,2,7};
        System.out.println(maximumTripletValue(nums));
    }
}
