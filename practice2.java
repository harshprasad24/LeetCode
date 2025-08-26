public class practice2 {
    public static void main(String[] args) {
        int nums[] = {0,1,1,1,0,1,1,0,1};
        System.out.println(longestSubarray(nums));
    }

    public static int longestSubarray(int[] nums) {
        int max = 0, n = nums.length;
        boolean hasZero = false;

        for (int i=0;i<n;i++) {
            if (nums[i] == 0) {
                hasZero = true;
                int left = 0, right = 0;
                for (int j = i - 1; j >= 0 && nums[j] == 1; j--){
                    left++;
                }
                for (int k=i+1;k<n && nums[k] == 1;k++){
                     right++;
                }

                max = Math.max(max,left+right);
            }
        }

        return hasZero ? max : n - 1;
    }
}
