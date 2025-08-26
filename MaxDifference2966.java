import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxDifference2966 {
    public static void main(String[] args) {
        int nums[] = { 1, 3, 4, 8, 7, 9, 3, 5, 1 };
        int k = 2;
        System.out.println(Arrays.deepToString(divideArray(nums, k)));
    }

    public static int[][] divideArray(int[] nums, int k) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i += 3) {
            int a = nums[i];
            int b = nums[i + 1];
            int c = nums[i + 2];

            if (c - a <= k) {
                result.add(Arrays.asList(a, b, c));
            } else {
                return new int[0][0];
            }
        }
        int[][] ans = new int[result.size()][3];
        for (int i = 0; i < result.size(); i++) {
            List<Integer> row = result.get(i);
            for (int j = 0; j < 3; j++) {
                ans[i][j] = row.get(j);
            }
        }
        return ans;
    }
}
