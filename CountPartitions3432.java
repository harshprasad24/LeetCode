public class CountPartitions3432 {
    public static int countPartitions(int[] nums) {
        int n = nums.length;
        if (n < 2) return 0;
        int count =0;
        int[] Prefix = new int[n];
        int[] Sufix = new int[n];
        Prefix[0]=nums[0];
        for (int i = 1; i < n ; i++) {
            Prefix[i] = Prefix[i - 1] + nums[i];
        }
        Sufix[n-1]=nums[n-1];
        for (int i = n - 2; i >= 0; i--) {
            Sufix[i] = Sufix[i + 1] + nums[i];
        }
        for(int i = 0 ; i < n -1 ; i++){
            int diff = Math.abs(Sufix[i+1] - Prefix[i]);
            if(diff%2==0){
                count++;
            }
        }
        return count; 
    }
    public static void main(String[] args) {
        int nums[] = {10,10,3,7,6};
        System.out.println(countPartitions(nums));
    }
}
