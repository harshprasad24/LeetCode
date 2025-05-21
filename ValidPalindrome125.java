public class ValidPalindrome125 {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String s) {
        StringBuilder sb  = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(Character.isLetterOrDigit(c)){
                sb.append(Character.toLowerCase(c));
            }
        }
        return Palindrome(sb.toString())==true;
    }
    public static boolean Palindrome(String s) {
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-1-i)){
                return false;
            }
        }
        return true;
    }
}


//////////////leet code//////////
// class Solution {
//     public boolean isPalindrome(String s) {
//         StringBuilder sb  = new StringBuilder();
//         for (int i = 0; i < s.length(); i++) {
//             char c = s.charAt(i);
//             if (Character.isLetterOrDigit(c)) {
//                 sb.append(Character.toLowerCase(c));
//             }
//         }
//         return isPalindromeString(sb.toString());
//     }

//     public boolean isPalindromeString(String s) {
//         for (int i = 0; i < s.length() / 2; i++) {
//             if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
//                 return false;
//             }
//         }
//         return true;
//     }
// }

