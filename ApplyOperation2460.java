public class ApplyOperation2460 {
    public static void main(String[] args) {
        int nums[] = {1,2,2,1,1,0}; 
        int ans [] = applyOperations(nums);
        for(int i=0;i<nums.length-1;i++){
            System.out.print(ans[i]);
        }
    }
    public static int[] applyOperations(int[] nums) {
        int ans []= new int[nums.length];
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                nums[i]=nums[i]*2;
                nums[i+1]=0;
            }
        }
        int k=0,j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                ans[nums.length-1-k++]=nums[i];
            }else{
                ans[j++]=nums[i];
            }
        }
        return ans;
    }
}
