public class setMatrixZero {
    public static void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        boolean[] rowFlag = new boolean[rows];
        boolean[] colFlag = new boolean[cols];

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(matrix[i][j] == 0){
                    rowFlag[i] = true;
                    colFlag[j] = true;
                }
            }
        }

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(rowFlag[i] || colFlag[j]){
                    matrix[i][j] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
       int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
       setZeroes(matrix);
       for(int i=0; i<matrix.length; i++){
        for(int j=0; j<matrix[0].length; j++){
            System.out.print(matrix[i][j] +" ");
        }
        System.out.println();
       }
    }
}
