import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class KDistantIndices2200 {
    public static void main(String[] args) {
        int nums[] = { 3, 4, 9, 1, 3, 9, 5 };
        int key = 9;
        int k = 1;
        System.out.println(findKDistantIndices(nums, key, k));
    }

    public static List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        Set<Integer> editSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == key) {
                int start = Math.max(0, i - k);
                int end = Math.min(nums.length - 1, i + k);
                for (int j = start; j <= end; j++) {
                    editSet.add(j);
                }
            }
        }
        List<Integer> result = new ArrayList<>(editSet);
        Collections.sort(result); 
        return result;
    }
}
