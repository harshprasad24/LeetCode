public class removeElement27 {
       public static void main(String[] args) {
        int nums[] ={0,1,2,2,3,0,4,2};
        int val = 2;
        int k = removeElement(nums,val);
        for (int i = 0; i < k; i++) {
            System.out.println(nums[i]);
        }
    }
       public static int removeElement(int[] nums, int val) {
        int k =0;
        int arr[]= new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(val!=nums[i]){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
