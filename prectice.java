public class prectice {
    public static void main(String[] args) {
        String s="()";
        int f = largestPalindrome(s);
        System.out.println(f);
    }
    public static int largestPalindrome(String s) {
        int maxLen = 0, left = 0, right = 0;
                for (int i = 0; i < s.length(); i++) {
                    if (s.charAt(i) == '(') left++;
                    else right++;
        
                    if (left == right) maxLen = Math.max(maxLen, 2 * right);
                    else if (right > left) left = right = 0; // Reset if more `)`
                }
                left = right = 0;
                for (int i = s.length() - 1; i >= 0; i--) {
                    if (s.charAt(i) == ')') right++;
                    else left++;
        
                    if (left == right) maxLen = Math.max(maxLen, 2 * left);
                    else if (left > right) left = right = 0; // Reset if more `(`
                }
                return maxLen;
    }
}
