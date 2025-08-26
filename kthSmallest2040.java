import java.util.Arrays;

public class kthSmallest2040 {
    public static long kthSmallestProduct(int[] nums1, int[] nums2, long k) {
                Arrays.sort(nums1);
        Arrays.sort(nums2);

        long low = -10000000000L, high = 10000000000L;

        while (low < high) {
            long mid = low + (high - low) / 2;
            long count = 0;

            for (int a : nums1) {
                if (a > 0) {
                    int l = 0, r = nums2.length;
                    while (l < r) {
                        int m = (l + r) / 2;
                        if ((long) a * nums2[m] <= mid) {
                            l = m + 1;
                        } else {
                            r = m;
                        }
                    }
                    count += l;
                } else if (a < 0) {
                    int l = 0, r = nums2.length;
                    while (l < r) {
                        int m = (l + r) / 2;
                        if ((long) a * nums2[m] <= mid) {
                            r = m;
                        } else {
                            l = m + 1;
                        }
                    }
                    count += nums2.length - l;
                } else {
                    if (mid >= 0) count += nums2.length;
                }
            }

            if (count < k) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return low;
    }
    public static void main(String[] args) {
        int nums1[] = {2,5};
        int nums2[] = {3,4};
        int k = 2;
        System.out.println(kthSmallestProduct(nums1, nums2, k)); 
    }
}
