public class PrimeDiagoanal2614 {
    public static int diagonalPrime(int[][] nums) {
        int arr[]=new int[nums.length*2],k=0;
        for(int i=0;i<nums.length;i++){
            arr[k++] = nums[i][i];      
            arr[k++] = nums[i][nums.length - 1 - i]; 
        }
        int prime =0;
        for (int i = 0; i < k; i++) {
            if (arr[i] < 2) continue;
            boolean isPrime = true;
            for (int j = 2; j * j <= arr[i]; j++) {
                if (arr[i] % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime && arr[i] > prime) {
                prime = arr[i];
            }
        }
        return prime;
    }
    public static void main(String[] args) {
        int nums[][] = {{1,2,3},{5,6,7},{9,10,11}};
        System.out.println(diagonalPrime(nums));
    }
}
