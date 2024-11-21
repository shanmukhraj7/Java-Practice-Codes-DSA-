public class unguardedCells{
    private static void dfs(int x, int y, int direction, int[][] grid){
        int m = grid.length, n = grid[0].length;
        if(x<0 || x>=m || y<0 || y>=n || grid[x][y] == 2 || grid[x][y] == 3) return;
        grid[x][y]=1;
        if(direction == 0) dfs(x-1,y,direction,grid);
        if(direction == 1) dfs(x,y+1,direction,grid);
        if(direction == 2) dfs(x+1,y,direction,grid);
        if(direction == 3) dfs(x,y-1,direction,grid);
    }
    public static int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int[][] grid = new int[m][n];
        int[] dir = {-1,0,1,0,-1};
        for(int[] g : guards) grid[g[0]][g[1]] = 2;
        for(int[] w : walls) grid[w[0]][w[1]] = 3;
        for(int[] g : guards){
            for(int i=0; i<4; i++){
                int x = g[0] + dir[i];
                int y = g[1] + dir[i+1];
                dfs(x,y,i,grid);
            }
        }
        int cnt = 0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j] == 0) cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        int m = 4, n = 6;
        int[][] guards = {{0,0},{1,1},{2,3}};
        int[][] walls = {{0,1},{2,2},{1,4}};
        System.out.println(countUnguarded(m, n, guards, walls));
    }
}