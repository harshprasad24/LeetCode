import java.util.Arrays;

public class MaxNumber1679 {
    public static void main(String[] args) {
        int nums[] ={3,1,3,4,3};
        int k=6;
    }
    public static int maxOperations(int[] nums, int k) {
        int i=0;
        int j=nums.length-1;
        int count=0;
        Arrays.sort(nums);
        while(i<j){
            long sum=(long) nums[i]+nums[j];
            if(sum==k){
                count++;
                i++;
                j--;
            }
            else if(sum<k){
                i++;
            }
            else{
                j--;
            }
        }
        return count;
    }
}
