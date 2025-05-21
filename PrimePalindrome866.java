public class PrimePalindrome866 {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(primePalindrome(n)); 
    }
    public static int primePalindrome(int n) {
        if (n <= 2) return 2;
        if (8 <= n && n <= 11) return 11;
        for(int i= n;;i++){
            if(isprime(i) && isPalindrome(i)){
                return i;
            }
        }

    }
    public static boolean isprime(int x){
        if (x < 2) return false;
        int limit = (int) Math.sqrt(x);
        for(int i=2;i<=limit;i++){
            if(x%i==0){
                return false;
            }
        }
        return true;
    }
    public static boolean isPalindrome(int x){
        int rev = 0, original = x;
        while (x > 0) {
            rev = rev * 10 + x % 10;
            x /= 10;
        }
        return rev == original;
    }
}




////////////////////////LEET CODE//////

// class Solution {
//     public int primePalindrome(int n) {
//         if (n <= 2) return 2;
//         if (8 <= n && n <= 11) return 11;

//         for (int len = 1; len < 6; len++) {
//             // Generate palindromes with odd length only
//             for (int root = (int)Math.pow(10, len - 1); root < Math.pow(10, len); root++) {
//                 String s = Integer.toString(root);
//                 String rev = new StringBuilder(s).reverse().substring(1);
//                 int palindrome = Integer.parseInt(s + rev); // odd-length palindrome

//                 if (palindrome >= n && isPrime(palindrome)) {
//                     return palindrome;
//                 }
//             }
//         }

//         return -1; // Should never reach here
//     }

//     private boolean isPalindrome(int x) {
//         int rev = 0, original = x;
//         while (x > 0) {
//             rev = rev * 10 + x % 10;
//             x /= 10;
//         }
//         return rev == original;
//     }

//     private boolean isPrime(int x) {
//         if (x < 2) return false;
//         int limit = (int) Math.sqrt(x);
//         for (int i = 2; i <= limit; i++) {
//             if (x % i == 0) return false;
//         }
//         return true;
//     }
// }
