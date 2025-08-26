import java.util.Arrays;
public class UniquePaths62 {
    public static void main(String[] args) {
        int m = 3,n=7;
        System.out.println(uniquePaths(m, n));
    }
    public static int uniquePaths(int m, int n) {
        int aboverow[] = new int[n];
        Arrays.fill(aboverow, 1);
        for(int i=1;i<m;i++){
            int currentrow[]=new int[n];
            Arrays.fill(currentrow,1);
            for(int j=1;j<n;j++){
                currentrow[j]=currentrow[j-1]+aboverow[j];
            }
            aboverow=currentrow;
        }
        return aboverow[n-1];
    }
}
