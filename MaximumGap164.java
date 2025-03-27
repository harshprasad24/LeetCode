import java.util.Arrays;

public class MaximumGap164 {
    public static void main(String[] args) {
        int nums[] = {3,6,9,1};
        int ans = maximumGap(nums);
        System.out.println(ans);
    }
    public static int maximumGap(int[] nums) {
        if (nums.length < 2) {
            return 0;
        }

        Arrays.sort(nums); 

        int largest = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            largest = Math.max(largest, nums[i + 1] - nums[i]);
        }
        return largest;
    }
}
