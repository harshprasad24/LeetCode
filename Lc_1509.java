import java.util.Arrays;

public class Lc_1509 {
    public static void main(String[] args) {
        int nums[] = {1,5,0,10,14};
        System.out.print(minDifference(nums));
    }
    public static int minDifference(int[] nums) {
        int n = nums.length;
        if (n <= 4) return 0;
        Arrays.sort(nums);
        
        int option1 = nums[n - 4] - nums[0];
        int option2 = nums[n - 3] - nums[1];
        int option3 = nums[n - 2] - nums[2];
        int option4 = nums[n - 1] - nums[3];

        return Math.min(Math.min(option1, option2), Math.min(option3, option4));
    }
}
