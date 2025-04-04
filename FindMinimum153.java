public class FindMinimum153 {
    public static void main(String[] args) {
        int nums[] = {3,4,5,1,2};
        int ans = findMin(nums);
        System.out.print(ans);
    }
    public static int findMin(int[] nums) {
        int min = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
            }
        }
        return min;
    }
}
