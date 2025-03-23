public class Lc_2529 {
    public static void main(String[] args) {
        int nums[] = {-3,-2,-1,0,0,1,2};
        int ans = maximumCount(nums);
        System.out.println(ans);
    }
    public static int maximumCount(int[] nums) {
        int pos=0,neg=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                pos++;
            }else if(nums[i]<0){
                neg++;
            }
        }
        return Math.max(pos, neg);
    }
}
