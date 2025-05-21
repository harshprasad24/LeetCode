public class Lc_2918 {
    public static void main(String[] args) {
        int nums1[] = {3,2,0,1,0}; 
        int nums2 [] = {6,5,0};
        System.out.println(minSum(nums1, nums2));
    }
    public static long minSum(int[] nums1, int[] nums2) {
        long sum1=0,sum2=0;
        int count1=0,count2=0;
        for(int i=0;i<nums1.length;i++){
            sum1+=nums1[i];
            if(nums1[i]==0){
                count1++;
            }
        }
        for(int i=0;i<nums2.length;i++){
            sum2+=nums2[i];
            if(nums2[i]==0){
                count2++;
            }
        }
        if (count1 == nums1.length && count2 == nums2.length)
            return Math.max(count1, count2);
            
        if ((count1 == 0 && sum1 < sum2 + count2) || (count2 == 0 && sum2 < sum1 + count1))
            return -1;

        return Math.max(sum1 + count1, sum2 + count2);
    }
}
