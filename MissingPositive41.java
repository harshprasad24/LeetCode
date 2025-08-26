
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingPositive41 {
    public static void main(String[] args) {
        int nums[] = { 3, 4, -1, 1 };
        System.out.println(firstMissingPositive(nums));
    }

    public static int firstMissingPositive(int[] nums) {
        List<Integer> Newnums = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                Newnums.add(nums[i]);
            }
        }
        Collections.sort(Newnums);
        int small = 1;
        for (int i = 0; i < Newnums.size(); i++) {
            if (Newnums.get(i) == small) {
                small++;
            } else if (Newnums.get(i) > small) {
                return small;
            }
        }   
        return small;
    }
}
