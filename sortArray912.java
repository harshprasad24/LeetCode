public class sortArray912 {
    public static void main(String[] args) {
        
    }
    public static int[] sortArray(int[] nums) {
        for(int i=1;i<nums.length;i++){
            int curent = nums[i];
            int prev = i-1;
            while(prev >=0 && nums[prev] > curent){
                nums[prev+1]=nums[prev];
                prev--;
            }
            nums[prev+1]=curent;
        }
        return nums;
    }
}
