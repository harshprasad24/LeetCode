public class SmallestIndex2057 {
    public static void main(String[] args) {
        int nums[] = {7,1,5,4};
        System.out.print(smallestEqual(nums));
    }
    public static int smallestEqual(int[] nums) {
        int ans =-1;
        for(int i=0;i<nums.length;i++){
            if(i%10==nums[i]){
                ans = i;
                break;
            }
        }
        return ans;
    }
}
