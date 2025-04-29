public class LC_2089 {
    public static void main(String[] args) {
        int nums[] = {1,2,5,2,3};
        int target = 2;
        int ans[] = targetIndices(nums, target);  
        for(int i=0;i<nums.length;i++){
            System.out.print(ans[i]);
        }                                     
    }
    public static int[] targetIndices(int[] nums, int target){
        int arr[] =new int [nums.length];
        for(int i=0;i<nums.length-1 ;i++){
            int Smallest = i;
            for(int j=i+1;j<nums.length;j++){
                if(nums[Smallest]>nums[j]){ 
                    Smallest=j;
                }
            }
            int temp =nums[Smallest];
            nums[Smallest]=nums[i];
            nums[i]=temp;
        }
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                arr[k++]=i;
            }
        }
        return arr;
    }
}
