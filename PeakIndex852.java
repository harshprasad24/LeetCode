public class PeakIndex852 {
    public static void main(String[] args) {
        int arr [] = {0,2,1,0};
        int ans = peakIndexInMountainArray(arr);
        System.out.print(ans);
    }
    public static int peakIndexInMountainArray(int[] arr) {
        int largest =0;
        for(int i=0;i<arr.length;i++){
            largest = Math.max(largest, arr[i]);
        }
        for(int i=0;i<arr.length;i++){
            if(largest==arr[i]){
                return i ;
            }
        }
        return 0;
    }
}
