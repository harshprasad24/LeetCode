public class countTotal2579 {
    public static void main(String[] args) {
        int n=1;
        long ans = coloredCells(n);
        System.out.print(ans);
    }
    public static long coloredCells(int n) {
        long ans=1;
        for(int i=0;i<n;i++){
            ans = (4*i) + ans;
        }
        return ans;
    }
}
