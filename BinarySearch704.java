public class BinarySearch704 {
    public static void main(String[] args) {
        int nums[] = {-1,0,3,5,9,12};
        int target=9;
        System.out.print(search(nums, target));
    }
    public static int search(int[] nums, int target) {
        int start =0,end=nums.length-1;
        while(start<=end){
            int mid =(start+end)/2;
            if(nums[mid]==target){
                return mid;
            }if(nums[mid]>target){
                end =mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }
}
