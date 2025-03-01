public class FirstMissingPositive41 {
    public static void main(String[] args) {
        int nums []= {100000, 3, 4000, 2, 15, 1, 99999};
        int x = firstMissingPositive(nums);
        System.out.print(x);
    }
    public static int firstMissingPositive(int[] nums) {
        int positive=1 ;
        for(int i=0;i<nums.length;i++){
            while(nums[i]>positive){
                if(positive>=nums[i]){
                    positive++;
                }
            }
        }
        return positive;
    }
}
