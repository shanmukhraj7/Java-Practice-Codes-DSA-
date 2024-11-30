public class minimumPathSumInMatrix {
    public static int minPathSum(int[][] grid) {
        int r = grid.length, c = grid[0].length;
        for(int i=1; i<r; i++) grid[i][0] += grid[i-1][0];
        for(int j=1; j<c; j++) grid[0][j] += grid[0][j-1];
        for(int i=1; i<r; i++){
            for(int j=1; j<c; j++){
                grid[i][j] += Math.min(grid[i-1][j], grid[i][j-1]);
            }
        }
        return grid[r-1][c-1];
    }

    public static void main(String[] args) {
        int[][] grid1 = {{1,3,1},{1,5,1},{4,2,1}};
        System.out.println(minPathSum(grid1));

        int[][] grid2 = {{1,2,3},{4,5,6}};
        System.out.println(minPathSum(grid2));
    }
}
