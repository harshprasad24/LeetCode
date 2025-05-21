import java.util.Arrays;

public class Lc_3194 {
    public static void main(String[] args) {
        int nums[] = {7,8,3,4,15,13,4,1};
        System.out.print((char) minimumAverage(null));
    }
    public static double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        int j=nums.length-1;
        double min=Integer.MAX_VALUE;
        while(i<=j){
            double avg=(double)(nums[i]+nums[j])/2;
            min=Math.min(min,avg);
            i++;
            j--;
        }
        return min;
    }
}
