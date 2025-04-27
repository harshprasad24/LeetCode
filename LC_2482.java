public class LC_2482 {
    public static void main(String[] args) {
        int grid[][] = {{0,1,1},{1,0,1},{0,0,1}};
        int ans[][]= onesMinusZeros(grid);
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                System.out.print(ans[i][j]);
            }
            System.out.println();
        }
    }
    public static int[][] onesMinusZeros(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int arr[][] = new int [rows][cols];
        int[] onesRow = new int[rows];
        int[] onesCol = new int[cols];
        int[] zerosRow = new int[rows];
        int[] zerosCol = new int[cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) {
                    onesRow[i]++;
                    onesCol[j]++;
                } else {
                    zerosRow[i]++;
                    zerosCol[j]++;
                }
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j]=onesRow[i]+onesCol[j]-zerosRow[i]-zerosCol[j];          
            }
        }
        return arr;
    }
}
