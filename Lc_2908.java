public class Lc_2908 {
    public int minimumSum(int[] nums) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                for(int k=j;k<nums.length;k++){
                    if(nums[i] < nums[j] && nums[k] < nums[j]){
                        min=Math.min(min,nums[i]+nums[j]+nums[k]);
                    }
                }
            }
        }
        return (min == Integer.MAX_VALUE) ? -1 : min;
    }
}
