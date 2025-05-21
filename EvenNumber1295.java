public class EvenNumber1295 {
    public static void main(String[] args) {
        int nums[] = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }
    public static int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int c = nums[i];
            int digitcount=0;
            while(c>0){ 
                digitcount++;
                c/=10;
            }
            if(digitcount%2==0){
                count++;
            }
        }
        return count;
    }
}
