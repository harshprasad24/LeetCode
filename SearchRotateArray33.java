public class SearchRotateArray33 {
    public static void main(String[] args) {
        int nums []={4,5,6,7,0,1,2};
        int target =0;
        int ans = search(nums, target);
        System.out.println(ans);
    } 
    public static  int search(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
        }
        return -1;
    }
}
 