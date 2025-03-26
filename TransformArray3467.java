
import java.util.Arrays;

public class TransformArray3467 {
    public static void main(String[] args) {
        int nums[] = {4,3,2,1};
        int arr[] = transformArray(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(arr[i]);
        }
    }
    public static int[] transformArray(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                nums[i]=0;
            }else{
                nums[i]=1;
            }
        }
        Arrays.sort(nums);
        return nums;
    }
}
