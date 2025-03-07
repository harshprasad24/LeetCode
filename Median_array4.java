public class Median_array4 {
    public static void main(String[] args) {
        int nums1[] = {1,2}; 
        int nums2[] = {3,4};
        double ans = findMedianSortedArrays(nums1, nums2);
        System.out.println(ans);
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i=0,j=0,k=0;
        int m=nums1.length , n =nums2.length;
        int arr[]=new int[m+n];
        while(j<n && i<m){
            if(nums1[i]<nums2[j]){
                arr[k++]=nums1[i++];
            }else{
                arr[k++]=nums2[j++];
            }
        }
        while(i<m){
            arr[k++]=nums1[i++];  
        }
        while(j<n){
            arr[k++]=nums2[j++];
        }
        if((m+n)%2==0){
            return (arr[(m+n)/2]+ arr[(m+n)/2-1])/2.0;
        }else{
            return arr[(m+n)/2];
        }
    }
}




