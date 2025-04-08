public class RearrangeArray2149 {
    public static void main(String[] args) {
       int nums[] = {3,1,-2,-5,2,-4};
       int ans[] = rearrangeArray(nums);
       for (int i = 0; i < nums.length; i++) {
           System.out.print(ans[i]);
       }
    }
    public static int[] rearrangeArray(int[] nums) {
        int arr[] = new int[nums.length];
        int pos=0,neg=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                arr[pos]=nums[i];
                pos+=2;
            }else{
                arr[neg]=nums[i];
                neg+=2;
            }
        }
        return arr;
    }
}
