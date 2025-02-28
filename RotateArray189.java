public class RotateArray189 {
    public static void main(String[] args) {
        int nums[] = {-1}; 
        int k = 3;
        oo(nums, k);
    }

    public static void oo(int[] nums, int k) {
        int arr[] = new int[nums.length];
        
        for (int i = 0; i < nums.length; i++) {   
            if (i < k) {
                arr[i] = nums[nums.length - i - 1];  // Fixed index
            } else {
                arr[i] = nums[i - k];
            }
        }
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(",");
            }
        }
    }
}
