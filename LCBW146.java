public class LCBW146{
//     public int countSubarrays(int[] nums) {
//         int n = nums.length;
//         int cnt=0;
//         for(int i=0; i<=n-3; i++){
//             if((nums[i] + nums[i+2])*2 == nums[i+1]) cnt++;
//         }
//         return cnt;
//     }

//     private static final int MOD = 1000000007;
//     private int count = 0;

//     public int countPathsWithXorValue(int[][] grid, int k) {
//         int m = grid.length;
//         int n = grid[0].length;
//         backtrack(grid, 0, 0, grid[0][0], k, m, n);
//         return count;
//     }

//     private void backtrack(int[][] grid, int i, int j, int currentXor, int k, int m, int n) {
//         // If we reach the bottom-right corner
//         if (i == m - 1 && j == n - 1) {
//             if (currentXor == k) {
//                 count = (count + 1) % MOD; // Count this path
//             }
//             return;
//         }

//         // Move right
//         if (j + 1 < n) {
//             backtrack(grid, i, j + 1, currentXor ^ grid[i][j + 1], k, m, n);
//         }

//         // Move down
//         if (i + 1 < m) {
//             backtrack(grid, i + 1, j, currentXor ^ grid[i + 1][j], k, m, n);
//         }
//     }
// }



// class Solution {
//     private final int MOD = 1000000007;
//     public int countPathsWithXorValue(int[][] grid, int k) {
//         int r = grid.length, c = grid[0].length;
//         // Initialize the previous and current DP arrays
//         int[][] previous = new int[c][1024];
//         int[][] current = new int[c][1024];
//         // Start at the top-left corner
//         previous[0][grid[0][0]] = 1;
//         // Traverse the grid
//         for (int i = 0; i < r; i++) {
//             for (int j = 0; j < c; j++) {
//                 // Process transitions from `previous` to `current`
//                 for (int z = 0; z < 1024; z++) {
//                     if (previous[j][z] > 0) {
//                         int currentXor = z;

//                         // Move to the right
//                         if (j + 1 < c) {
//                             int nextXor = currentXor ^ grid[i][j + 1];
//                             current[j + 1][nextXor] = (current[j + 1][nextXor] + previous[j][currentXor]) % MOD;
//                         }

//                         // Move downward
//                         if (i + 1 < r) {
//                             int nextXor = currentXor ^ grid[i + 1][j];
//                             current[j][nextXor] = (current[j][nextXor] + previous[j][currentXor]) % MOD;
//                         }
//                     }
//                 }
//             }n
//             // Swap previous and current
//             previous = current;
//             current = new int[c][1024]; // Reset current for the next row
//         }
//         // Return the result for the bottom-right corner
//         return previous[c - 1][k];
//     }
 }
