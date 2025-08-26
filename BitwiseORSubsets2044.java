public class BitwiseORSubsets2044 {
    public static void main(String[] args) {
        int nums[]= {3,2,1,5};
        System.out.println(countMaxOrSubsets(nums));
    }
    public static int countMaxOrSubsets(int[] nums) {
        int BitwiseOr = 0,count=0;
        for(int i=0;i<nums.length;i++){
            BitwiseOr |= nums[i];
        }
        int totalSubsets = 1 << nums.length; 
        for (int mask = 1; mask < totalSubsets; mask++) {
            int currentOr = 0;
            for (int i = 0; i < nums.length; i++) {
                if ((mask & (1 << i)) != 0) {
                    currentOr |= nums[i];
                }
            }
            if (currentOr == BitwiseOr) {
                count++;
            }
        }

        return count;
}
}
