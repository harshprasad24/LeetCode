public class SetMatrixZeroes73 {
    public static void main(String[] args) {
        int matrix [][] = {
            {0,1,2,0},
            {3,4,5,2},
            {1,3,1,5}
        };
        setZeroes(matrix);
    }

    public static void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] ans = new int[rows][cols]; 

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                ans[i][j] = matrix[i][j];
            }
        }

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                if(matrix[i][j] == 0) {
                    for(int k = 0; k < cols; k++) {
                        ans[i][k] = 0;
                    }
                    for(int k = 0; k < rows; k++) {
                        ans[k][j] = 0;
                    }
                }
            }
        }

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                matrix[i][j] = ans[i][j];
            }
        }
    }
}
