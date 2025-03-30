public class ValidPerfectSquare367 {
    public static void main(String[] args) {
        int nums = 16;
        boolean ans = isPerfectSquare(nums);
        System.out.println(ans);
    }
    public static boolean isPerfectSquare(int num) {
        int start = 1,end = num;
        while(start<=end){
            int mid = start + (end - start) / 2;; 
            long a = (long)mid*mid;
            if(a == num){
                return true;
            }else if(a>num){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return false;
    }
}
