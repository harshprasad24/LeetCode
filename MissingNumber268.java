public class MissingNumber268 {
    public static void main(String[] args) {
        int nums[] = {0,1};
        int ans = missingNumber(nums);
        System.out.println(ans);
    }
    public static int missingNumber(int[] nums) {
        int k=0;
        for(int i=0;i<nums.length-1;i++){
            int small=i;
            for(int j=i+1;j<nums.length;j++){
                if(nums[small]>nums[j]){
                    small=j;
                }
            }
            int temp = nums[small];
            nums[small]=nums[i];
            nums[i]=temp;
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==k){
                k++;
            }else{
                return k;
            }
        }
        return k++;
    }
}
