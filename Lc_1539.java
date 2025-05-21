public class Lc_1539 {
    public static void main(String[] args) {
        int arr[] = {2,3,4,7,11}, k = 5;
        System.out.print(findKthPositive(arr, k));
    }
    public static int findKthPositive(int[] arr, int k) {
        int b=1,a=0,c=0;
        int sum[] = new int[k];
        while(c<k){
            if(a < arr.length && b == arr[a]){
                a++;
            }else{
                sum[c++]=b;
            }
            b++;
        }
        return sum[k-1];
    }
}
