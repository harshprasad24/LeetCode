import java.util.Arrays;

public class DivideArray2206 {
    public static void main(String[] args) {
        int nums [] = {3,2,3,2,2,2};
        System.out.println(divideArray(nums));
    }
    public static boolean divideArray(int[] nums) {
        int n = nums.length,count=0,k=0;
        if(nums.length%2!=0) return false;
        Arrays.sort(nums);
        while (k<n) { 
            if(nums[k]==nums[k+1]){
                count++;
                k+=2;
            }else{
                return false;
            }
        }
        return count==n/2;
    }
}
