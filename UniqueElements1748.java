public class UniqueElements1748 {
    public static void main(String[] args) {
        int nums[] = {1,2,3,2};
        System.out.println(sumOfUnique(nums));
    }
    public static int sumOfUnique(int[] nums) {
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            largest = Math.max(largest, nums[i]);
        }
        int count[] = new int [largest+1];
        for(int i=0;i<nums.length;i++){
            count[nums[i]]++;
        }
        int sum = 0;
        for(int i=1;i<count.length;i++){
            if (count[i]==1) sum +=i  ;
        }
        return sum;
    }
}
