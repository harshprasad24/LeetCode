
import java.util.Arrays;

public class LargestTwice747 {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4};
        int ans = dominantIndex(nums);
        System.out.println(ans);
    }
    public static int dominantIndex(int[] nums) {
        int large=0,a=0;
        for(int i=0;i<nums.length;i++){
            large = Math.max(large, nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            if(large==nums[i]){
                a=i;
            }
        }
        for(int i=0;i<nums.length;i++){
            Arrays.sort(nums);
        }

        if(nums[nums.length-1]>=nums[nums.length-2]*2){
            return a;
        }
        return -1;
    }
}
