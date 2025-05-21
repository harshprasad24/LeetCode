public class LuckyInteger1394 {
    public static void main(String[] args) {
        int arr[] = {4,3,2,2,4,1,3,4,3};
        System.out.println(findLucky(arr));
    }
    public static int findLucky(int[] arr) {
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest = Math.max(largest, arr[i]);
        }
        int count[] = new int [largest+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        int ans = -1;
        for(int i=1;i<count.length;i++){
            if (count[i]==i) ans = i ;
        }
        return ans;
    }
}
