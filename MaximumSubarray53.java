public class MaximumSubarray53 {
    public static void main(String[] args) {
        int nums[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {
        int cs = nums[0];
        int ms = nums[0];

        for (int i = 1; i < nums.length; i++) {
            cs = Math.max(nums[i], cs + nums[i]); 
            ms = Math.max(ms, cs); 
        }

        return ms;
    }
}
