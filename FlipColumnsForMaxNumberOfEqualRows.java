//  https://leetcode.com/problems/flip-columns-for-maximum-number-of-equal-rows/ //

import java.util.HashMap;
import java.util.Map;

public class FlipColumnsForMaxNumberOfEqualRows {
    public static int maxEqualRowsAfterFlips(int[][] matrix) {
       Map<String, Integer> pc = new HashMap<>();
       int max = 0;
       for(int[] r : matrix){
            StringBuilder p = new StringBuilder();
            StringBuilder c = new StringBuilder();
            for(int cell : r){
                if(r[0] == 0){
                    p.append(cell);
                    c.append(1-cell);
                }
                else{
                    p.append(1-cell);
                    c.append(cell);
                }
            }
            String str = p.toString();
            pc.put(str, pc.getOrDefault(str,0)+1);
            max = Math.max(max, pc.get(str));
       }
        return max;
    }

    public static void main(String[] args) {
        int[][] matrix = {{0,0,0},
                          {0,0,1},
                          {1,1,0}};

        System.out.println(maxEqualRowsAfterFlips(matrix));
    }
}
