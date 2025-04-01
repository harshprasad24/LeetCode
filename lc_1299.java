public class lc_1299 {
    public static void main(String[] args) {
        int arr[] = {17,18,5,4,6,1};
        int ans[] = replaceElements(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(ans[i]);
        }
    }
    public static int[] replaceElements(int[] arr) {
        int maxright[] = new int [arr.length];
        maxright[arr.length-1]=-1;
        int maxSoFar = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            maxright[i] = maxSoFar;
            maxSoFar = Math.max(maxSoFar, arr[i]);
        }
        return maxright;
    }
}
