import java.util.Arrays;

public class LongestHarmonious594 {
    public static void main(String[] args) {
        int nums[] = { 1, 3, 2, 2, 5, 2, 3, 7 };
        System.out.println(findLHS(nums));
    }

    public static int findLHS(int[] nums) {
        Arrays.sort(nums);
        int max = 0;
        int start = 0;
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] - nums[start] > 1) {
                start++;
            }
            if (nums[i] - nums[start] == 1) {
                max = Math.max(max, i - start + 1);
            }
        }
        return max;
    }
}
