public class PeakElement162 {
    public static void main(String[] args) {
        int nums[] = {1,2,3,1};
        int ans = findPeakElement(nums);    
        System.out.print(ans);                              
    }
    public static int findPeakElement(int[] nums) {
        int max = Integer.MIN_VALUE;
        int a = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
                a=i;
            }
        }
        return a;
    }
}
