import java.util.Arrays;

public class DuplicateNumber287 {
    public static void main(String[] args) {
        int nums[] = {1,2,5,2,3};
        int ans = findDuplicate(nums);    
        System.out.print(ans);                              
    } 
    public static int findDuplicate(int[] nums) {   
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                return nums[i];
            }
        }
        return -1;
    }
}
