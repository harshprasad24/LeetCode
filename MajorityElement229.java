import java.util.Arrays;

public class MajorityElement229 {
    public static void main(String[] args) {
        int nums[] = {1,2};
        int ans [] = majorityElement(nums);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]);
        }
    }
    public static int[] majorityElement(int[] nums) {
        int n = nums.length,count=1,k=0;
        int a = n/3; 
        int ans [] = new int [n];
        Arrays.sort(nums);
        for(int i=1;i<n;i++){
            if(nums[i]==nums[i-1]){
                count++;
            }else{
                if(count>a){
                    ans[k++]=nums[i-1];
                }
                count=1;
            }
        }
        if (count > a) {
            ans[k++] = nums[n - 1];
        }
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = ans[i];
        }

        return result;
    }
}



///////////////////leetcode solution///////////////


// class Solution {
//     public List<Integer> majorityElement(int[] nums) {
//         int n = nums.length, count = 1;
//         int a = n / 3;
//         List<Integer> result = new ArrayList<>();
//         Arrays.sort(nums);

//         for (int i = 1; i < n; i++) {
//             if (nums[i] == nums[i - 1]) {
//                 count++;
//             } else {
//                 if (count > a) {
//                     result.add(nums[i - 1]);
//                 }
//                 count = 1;
//             }
//         }

//         if (count > a) {
//             result.add(nums[n - 1]);
//         }

//         return result;
//     }
// }