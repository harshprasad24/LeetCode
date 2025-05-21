public class Lc_2905 {
    public static void main(String[] args) {
        int nums[] = {5,1,4,1};
        int indexDifference = 2, valueDifference = 4;
        System.out.print(findIndices(nums, indexDifference, valueDifference));
    }
    public static int[] findIndices(int[] nums, int indexDifference, int valueDifference) {
        int n = nums.length;
        int minIndex = 0;
        int maxIndex = 0;

        for (int i = indexDifference; i < n; i++) {
            int j = i - indexDifference;
            if (nums[j] < nums[minIndex]) {
                minIndex = j;
            }
            if (nums[j] > nums[maxIndex]) {
                maxIndex = j;
            }

            if (Math.abs(nums[i] - nums[minIndex]) >= valueDifference) {
                return new int[]{minIndex, i};
            }

            if (Math.abs(nums[i] - nums[maxIndex]) >= valueDifference) {
                return new int[]{maxIndex, i};
            }
        }

        return new int[]{-1, -1};
    }
}
