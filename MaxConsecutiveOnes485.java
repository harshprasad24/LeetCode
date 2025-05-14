public class MaxConsecutiveOnes485 {
    public static void main(String[] args) {
        int nums[]= {0};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0, ans = 0; 
        for (int num : nums) {
            if (num == 1) {
                count++; 
                ans = Math.max(ans, count);
            } else {
                count = 0; 
            }
        }
        return ans;
    }
}
