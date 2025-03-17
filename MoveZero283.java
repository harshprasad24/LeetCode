public class MoveZero283 {
    public static void main(String[] args) {
        int nums [] = {0,1,0,3,12};
        moveZeroes(nums);
    }
    public static void moveZeroes(int[] nums) {
        int arr[] = new int [nums.length],j=0,k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                arr[nums.length-1-k++]=nums[i];
            }else{
                arr[j++]=nums[i];
            }
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=arr[i];
            System.out.print(nums[i]);
        }
    }
}
