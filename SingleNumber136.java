import java.util.Arrays;

public class SingleNumber136 {
    public static void main(String[] args) {
        int nums[] = {-1};
        int k = singleNumber(nums);
        System.out.print(k);
    }
    public static int singleNumber(int[] nums) {
        int k=0;
        Arrays.sort(nums);
        while(k<nums.length-1){
            if(nums[k]==nums[k+1]){
                k+=2;
            }else{
                return nums[k];
            }
        }
        return nums[k];
    }
}
