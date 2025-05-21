public class Lc_3005 {
    public static int maxFrequencyElements(int[] nums){
        int[] count = new int[101]; 
        int maxFreq = 0;
        for(int num : nums){
            count[num]++;
            maxFreq = Math.max(maxFreq, count[num]);
        }

        int result = 0;
        for(int freq : count){
            if(freq == maxFreq){
                result += freq;                  
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int nums[] = {1, 2, 2, 3, 1, 4};
        System.out.println(maxFrequencyElements(nums)); 
    }
}
