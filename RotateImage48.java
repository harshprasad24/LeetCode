public class RotateImage48 {
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
        rotate(matrix);
    }

    public static void rotate(int[][] matrix) {
        int arr[][] = new int [matrix.length][matrix.length];
        int k=matrix.length-1;
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                arr[j][k] = matrix[i][j];
            }
            k--;
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                matrix[i][j]=arr[i][j];
            }
        }
    }
}
