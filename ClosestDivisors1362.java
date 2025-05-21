public class ClosestDivisors1362 {
    public static void main(String[] args) {
        int num =8;
        int ans [] = closestDivisors(num);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]);
        }
    }
    public static int[] closestDivisors(int num) {
        int[] arr = new int[2];
        int finaldiff = Integer.MAX_VALUE;
        for (int n = num + 1; n <= num + 2; n++) {
            for (int i = 1; i * i <= n; i++) {
                if (n % i == 0) {
                    int j = n / i;
                    int diff = Math.abs(j - i);
                    if (diff < finaldiff) {
                        finaldiff = diff;
                        arr[0] = i;
                        arr[1] = j;
                    }
                }
            }
        }
        return arr;
    }
}
