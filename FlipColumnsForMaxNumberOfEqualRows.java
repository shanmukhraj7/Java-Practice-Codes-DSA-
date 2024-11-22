//  https://leetcode.com/problems/flip-columns-for-maximum-number-of-equal-rows/ //

import java.util.HashMap;
import java.util.Map;

public class FlipColumnsForMaxNumberOfEqualRows {
    public static int maxEqualRowsAfterFlips(int[][] matrix) {
       Map<String, Integer> pc = new HashMap<>(); // pattern count string builder method
       int max = 0; // max rows
       for(int[] row : matrix){
            StringBuilder pattern = new StringBuilder(); //to store the pattern
            StringBuilder comp = new StringBuilder(); //to store the complement
            for(int cell : row){
                if(row[0] == 0){
                    pattern.append(cell);
                    comp.append(1-cell);
                }
                else{
                    pattern.append(1-cell);
                    comp.append(cell);
                }
            }
            String str = pattern.toString(); // changing the pattern to string format
            pc.put(str, pc.getOrDefault(str,0)+1); /*  store the string value in the pattern count and getOrDefault checks whether the value 
            exists in the pattern count */
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
