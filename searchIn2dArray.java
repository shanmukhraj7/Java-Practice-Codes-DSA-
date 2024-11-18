import java.util.Arrays;

public class searchIn2dArray {
    public static void main(String[] args) {
        int[][] arr= {
            {10,20,30,40},
            {11,21,31,41},
            {12,22,32,42},
            {13,23,33,43}
        };
        System.out.println(Arrays.toString(search(arr, 32)));
    }
    public static int[] search(int[][] arr, int target)
    {
        int r = 0;
        int c = arr.length-1;
        while(r < arr.length && c >= 0)
        {
            if(arr[r][c] == target)
            {
                return new int[] {r,c};
            }
            else if(arr[r][c] < target)
            {
                r++;
            }
            else
            {
                c--;
            }
        }
        return new int[]{-1,-1};
    }
}
