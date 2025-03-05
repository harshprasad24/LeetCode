public class palindrome9 {
    public static void main(String[] args) {
        int x = 121;
    }
    public static  boolean isPalindrome(int x) {
        int no =x , rev=0;
        while(x>0){
            int a = x%10;
            rev = (rev * 10)+a;
            x/=10;
        }
        return no==rev;
    }
}
