public class TransposeMatrix867 {
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3},{4,5,6}};  
        int ans [][] = transpose(matrix);
        for(int i=0;i<matrix[0].length;i++){
            for(int j=0;j<matrix.length;j++){
                System.out.print(ans[i][j]);
            }
            System.out.println();
        }
    }
    public static int[][] transpose(int[][] matrix) {
        int arr[][] = new int[matrix[0].length][matrix.length]; 
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                arr[j][i]=matrix[i][j];
            }
        }
        return arr;
    }
}

