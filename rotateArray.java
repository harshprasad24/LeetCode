public class rotateArray {
    public static void main(String[] args) {
        int nums[] = {-1,-100,3,99}; 
        int k =2;
        rotate(nums, k);
    }
    public static void rotate(int[] nums, int k) {
        int arr[] = new int [nums.length];
        while(k>nums.length){
            k-=nums.length;
        }
        for(int i=0;i<nums.length;i++){
            if(k>0 && k-1-i>=0 && nums.length-1-i >=0){
                arr[k-1-i]=nums[nums.length-1-i];
            }else if (i-k>=0 && i-k<nums.length){
                arr[i]=nums[i-k];
            }
        }
        for(int i =0;i<nums.length;i++){
            arr[i]=nums[i];
        }
        System.out.print("[");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
        System.out.print("]");
    }
}
