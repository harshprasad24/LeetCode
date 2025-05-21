public class FindthePeaks2951 {
    public static void main(String[] args) {
        int mountain[] = {1,4,3,8,5};
        int ans [] = findPeaks(mountain);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]);
        }

    }
    public static int[] findPeaks(int[] mountain) {
        int k=0;
        int temp[]=new int[mountain.length];
        for(int i=0;i<mountain.length-1;i++){
            if(mountain[i]<mountain[i+1]){
                temp[k++]=i+1;
            }
        }
        int ans[]=new int[k];
        for(int i=0;i<k;i++){
            ans[i]=temp[i];
        }
        return ans;
    }
}

///////////LEETCODE SOLUTION //////////

// class Solution {
//     public List<Integer> findPeaks(int[] mountain) {
//         List<Integer> peaks = new ArrayList<>();
    
//     for (int i = 1; i < mountain.length - 1; i++) {
//         if (mountain[i] > mountain[i - 1] && mountain[i] > mountain[i + 1]) {
//             peaks.add(i);
//         }
//     }

//     return peaks;
//     }
// }
