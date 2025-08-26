public class ValidSubsequence3201 {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4 };
        System.out.println(maximumLength(nums));
    }

    public static int maximumLength(int[] nums) {
        int maxLen = 1;
        int currLen = 1;
        for (int i = 1; i < nums.length; i++) {
            if ((nums[i] + nums[i - 1]) % 2 == 1) { 
                currLen++;
                maxLen = Math.max(maxLen, currLen);
            } else {
                currLen = 1;
            }
        }
        return maxLen;
    }
}
