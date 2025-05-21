public class practice2 {
    public static void main(String[] args) {
        int[] nums = {2, 4, 3, 7, 10, 6};
        System.out.println(distinctPrimeFactors(nums));
    }

    public static int distinctPrimeFactors(int[] nums) {
        int product = 1;
        for (int num : nums) {
            product *= num;
        }

        int count = 0;

        for (int i = 2; i * i <= product; i++) {
            if (product % i == 0 && isPrime(i)) {
                count++;
                while (product % i == 0) {
                    product /= i;
                }
            }
        }

        if (product > 1 && isPrime(product)) {
            count++;
        }

        return count;
    }

    public static boolean isPrime(int x) {
        if (x <= 1) return false;
        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) return false;
        }
        return true;
    }
}


class Solution {
    public int distinctPrimeFactors(int[] nums) {
        int product = 1;
        for (int num : nums) {
            product *= num;
        }

        int count = 0;

        for (int i = 2; i * i <= product; i++) {
            if (product % i == 0 && isPrime(i)) {
                count++;
                while (product % i == 0) {
                    product /= i;
                }
            }
        }

        if (product > 1 && isPrime(product)) {
            count++;
        }

        return count;
    }

    public boolean isPrime(int x) {
        if (x <= 1) return false;
        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) return false;
        }
        return true;
    }
}