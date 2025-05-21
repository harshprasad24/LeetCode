import java.util.Arrays;

public class SingleNumber137 {
    public static void main(String[] args) {
        int nums[] = {2,2,3,2};
        System.out.print(singleNumber(nums));
    }
    public static int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int k=0;
        while(k<nums.length-1){
            if(nums[k]==nums[k+1]){
                k+=3;
            }else{
                return nums[k];
            }
        }
        return nums[nums.length-1];
    }
}
