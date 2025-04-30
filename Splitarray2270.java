public class Splitarray2270 {
    public static int waysToSplitArray(int[] nums) {
        int n = nums.length;
        int[] rightSum = new int[n - 1];
        int[] leftSum = new int[n - 1];
        rightSum[0] = nums[0];
        for (int i = 1; i < n - 1; i++) {
            rightSum[i] = rightSum[i - 1] + nums[i];
        }
        leftSum[n - 2] = nums[n - 1];
        for (int i = n - 3; i >= 0; i--) {
            leftSum[i] = leftSum[i + 1] + nums[i + 1];
        }
        int count=0;
        for(int i = 0 ; i < n - 1; i++){
            if(rightSum[i]>=leftSum[i]){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int nums[] = {10,4,-8,7};
        System.out.println(waysToSplitArray(nums)); 
    }
}
