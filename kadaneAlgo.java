public class kadaneAlgo {
    public static int maxSubarraySum(int[] arr) {
        int maxSum = arr[0];
        int currentSum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

   public static void main(String[] args) {
    int[][] arrays = {
        {-2, -3, 4, -1, -2, 1, 5, -3},
        {2, 3, -8, 7, -1, 2, 3},
        {-2, -4},
        {5, 4, 1, 7, 8}
    };

    for (int i = 0; i < arrays.length; i++) {
        System.out.println("Maximum contiguous sum for array " + (i + 1) + " is " + maxSubarraySum(arrays[i]));
    }
}

}
