import java.util.Arrays;

public class Lc_154 {
    public static void main(String[] args) {
        int nums[] = {1,3,5};
        System.out.print(findMin(nums));
    }
    public static int findMin(int[] nums) {
        Arrays.sort(nums);
        return nums[0];
    }
}
