public class pivotInteger2485 {
    public static void main(String[] args) {
        int n=8;
        System.out.print(pivotInteger(n));
    }
    public static int pivotInteger(int n) {
        int totalSum = (n * (n + 1)) / 2; 
        int leftSum = 0;

        for (int k = 1; k <= n; k++) {
            leftSum += k; 
            int rightSum = totalSum - leftSum + k; 

            if (leftSum == rightSum) {
                return k; 
            }
        }
        return -1;
    }
}
