public class LC_81 {
    public static void main(String[] args) {
        int nums[] = {2,5,6,0,0,1,2}, target = 3;
        boolean ans = search(nums, target);
        System.out.print(ans);
    }
    public static boolean search(int[] nums, int target) {
        // Arrays.sort(nums);
        // int start =0,end=nums.length-1;
        // while(start<=end){
        //     int mid = start+end/2;
        //     if(nums[mid]==target){
        //         return true;
        //     }else if(mid>target){
        //         end=mid-1;
        //     }else{
        //         start=mid+1;
        //     }
        // } 
        for(int i=0;i<nums.length;i++){
            if(target==nums[i]){
                return true;
            }
        }
        return false;
    }
}
