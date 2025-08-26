public class ZeroFilled2348 {
    public static void main(String[] args) {
        int nums[] = {1,3,0,0,2,0,0,4};
        System.out.println(zeroFilledSubarray(nums));
    }
    public static long zeroFilledSubarray(int[] nums) {
        int count=0;
        long subarrays=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                count++;
                subarrays+=count;
            }else{
                count=0;
            }
        }
        return subarrays;
    }
}
