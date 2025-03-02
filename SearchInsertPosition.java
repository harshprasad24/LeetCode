public class SearchInsertPosition {
    public static void main(String[] args) {
        int nums[]={1,3,5,6};
        int target=2;
        int search=searchInsert(nums, target);
        System.out.println("The ans is"+search);
    }
    public static int searchInsert(int[] nums, int target) {
        int start=0,end=nums.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(target==nums[mid]){
                return mid;
            }if(target>nums[mid]){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return start;
    }
}
