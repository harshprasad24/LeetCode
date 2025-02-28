public class SingleNumber136 {
    public static void main(String[] args) {
        int nums[] = {-1};
        int k = singleNumber(nums);
        System.out.print(k);
    }
    public static int singleNumber(int[] nums) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) { 
            k = k^ nums[i]; 
        }
        return k;
    }
}
