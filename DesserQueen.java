import java.util.*;

public class DesserQueen{
    static int[][] directions = {{-1,0},{1,0},{0,-1},{0,1}};
    public static int minDist(int n, char[][] grid){
        int[][] pc = new int[n][n];
        for(int[] r : pc){
            Arrays.fill(r,Integer.MAX_VALUE);
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[2]));
        int a=0,c=0,b=0,d=0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j] == 'S'){
                    a=i;
                    c=j;
                }
                else if(grid[i][j] == 'E'){
                    b=i;
                    d=j;
                }
            }
        }
        pc[a][c] = 0;
        pq.add(new int[] {a,c,0});
        while(!pq.isEmpty()){
            int[] cur = pq.poll();
            int x=cur[0], y=cur[1], val = cur[2];
            if(x==b && y==d) return val;
            for(int[] dir : directions){
                int nx = x + dir[0], ny = y + dir[1];
                if(nx>=0 && nx<n && ny>=0 && ny<n && grid[nx][ny] != 'M'){
                    int nval = val+(grid[nx][ny] == 'T' ? val : val+1);
                    if(nval < pc[nx][ny]){
                        pc[nx][ny] = nval;
                        pq.add(new int[]{nx,ny,nval});
                    }
                }
            }
        } 
        return -1;
    }

    public static void main(String[] args) {
        int n1=4;
        char[][] grid1 = {{'S','D','D','D'},{'T','T','T','T'},{'D','D','D','D'},{'D','E','D','D'}};
        System.out.println(minDist(n1, grid1)); 

        int n2=5;
        char[][] grid2 = {{'S','D','D','D','M'},{'T','T','T','T','D'},{'D','D','D','T','D'},{'D','M','D','T','D'},{'D','D','D','T','E'}};
        System.out.println(minDist(n2, grid2));

    }
}