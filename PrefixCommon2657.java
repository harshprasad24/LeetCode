public class PrefixCommon2657 {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n= A.length;
        int freq[]=new int[n+1];
        int ans[]=new int[n];
        int count=0;
        int k=0;
        for(int i=0;i<A.length;i++){
            freq[A[i]]++;
            if(freq[A[i]]==2){
                count++;
            }
            freq[B[i]]++;
            if(freq[B[i]]==2){
                count++;
            }
            ans[k++]=count;
        }
        return ans;
    }
}
