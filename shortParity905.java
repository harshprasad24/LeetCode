public class shortParity905 {
    public static void main(String[] args) {
        int nums [] = {3,1,2,4};
        int ans[] = sortArrayByParity(nums);
        for(int i=0;i<nums.length;i++){
            System.out.print(ans[i]);
        }
    }
    public static int[] sortArrayByParity(int[] nums) {
        int arr[] = new int [nums.length];
        int k=0,j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                arr[j++]=nums[i];
            }else{
                arr[nums.length-1-k++]=nums[i];
            }
        }
        return arr;
    }
}
