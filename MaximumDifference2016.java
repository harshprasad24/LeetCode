public class MaximumDifference2016 {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6,7,8,9,0};
        System.out.print(maximumDifference(nums));
    }
    public static int maximumDifference(int[] nums) {
        int largest = -1;
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                if(nums[i]<nums[j]){
                    largest=Math.max(largest , nums[j]-nums[i]);
                }
            }
        }
        return largest;
    }
}
