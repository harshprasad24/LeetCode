public class RemoveDuplicate26 {
    public static void main(String[] args) {
        int nums []= {1,1,2};                           //0,0,1,1,1,2,2,3,3,4
        int ans = removeDuplicates(nums);
        System.out.println();
        System.out.println(ans);
    }
    public static int removeDuplicates(int[] nums) {
        int k=0;
        int arr[] = new int [nums.length];
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]!=nums[i+1]){
                arr[k]=nums[i];
                k++;
            }
        }
        arr[k]=nums[nums.length-1];
        for(int i=0;i<nums.length;i++){
            nums[i]=arr[i];
        }
        for(int i=0;i<=k;i++){
            System.out.println(nums[i]);
        }
        return k+1;
    }
}
