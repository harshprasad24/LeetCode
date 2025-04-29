import java.util.Arrays;

public class kthSmallest2040 {
    public static long kthSmallestProduct(int[] nums1, int[] nums2, long k) {
        int count=0;
        long arr[] = new long[ nums1.length * nums2.length];
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                arr[count++]=(long)nums1[i]*nums2[j];        
            }
        }
        Arrays.sort(arr);
        return arr[(int) k-1];
    }
    public static void main(String[] args) {
        int nums1[] = {2,5};
        int nums2[] = {3,4};
        int k = 2;
        System.out.println(kthSmallestProduct(nums1, nums2, k)); 
    }
}
