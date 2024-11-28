import java.util.ArrayDeque;
import java.util.Deque;

public class minimumObstaclesRemovedToReachCorner{
    private static final int[][] directions = {{0,1},{0,-1},{1,0},{-1,0}};

    public static int minimumObstacles(int[][] grid) {
        int r = grid.length, c = grid[0].length;
        int[][] minObstacles = new int[r][c];
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                minObstacles[i][j] = Integer.MAX_VALUE;
            }
        }
        minObstacles[0][0] = 0;
        Deque<int[]> dq = new ArrayDeque<>();
        dq.add(new int[] {0,0,0});
        while(!dq.isEmpty()){
            int[] curr = dq.poll();
            int obs = curr[0], row = curr[1], col = curr[2];
            for(int[] dir : directions){
                int newR = row + dir[0], newC = col + dir[1];
                if(isValid(grid, newR, newC) && minObstacles[newR][newC] == Integer.MAX_VALUE){
                    if(grid[newR][newC] == 1){
                        minObstacles[newR][newC] = obs+1;
                        dq.addLast(new int[] {obs+1, newR, newC});
                    }
                    else{
                        minObstacles[newR][newC] = obs;
                        dq.addFirst(new int[] {obs, newR, newC});
                    }
                }
            }
        }
        return minObstacles[r-1][c-1];
    }

    private static boolean isValid(int[][] grid, int r, int c){
        return r>=0 && c>=0 && r<grid.length && c<grid[0].length;
    }

    public static void main(String[] args) {
        int[][] grid1 = {{0,1,1},{1,1,0},{1,1,0}};
        System.out.println(minimumObstacles(grid1));

        int[][] grid2 = {{0,1,0,0,0},{0,1,0,1,0},{0,0,0,1,0}};
        System.out.println(minimumObstacles(grid2));
    }
}