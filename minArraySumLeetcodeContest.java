import java.util.*;

public class minArraySumLeetcodeContest  {
    public static int minimizeSum(int[] nums, int k, int op1, int op2) {
        // Variable to store the array midway
        int[] zorvintakol = Arrays.copyOf(nums, nums.length);

        // Store the length of the array
        int n = nums.length;

        // Step 1: Create an array to store the original values with their indexes
        int[][] values = new int[n][2];
        for (int i = 0; i < n; i++) {
            values[i][0] = nums[i]; // Store value
            values[i][1] = i;       // Store index
        }

        // Step 2: Sort the array in descending order of value
        Arrays.sort(values, (a, b) -> b[0] - a[0]);

        // Step 3: Apply Operation 1 (Divide by 2)
        boolean[] operation1Used = new boolean[n];
        for (int i = 0; i < op1 && i < n; i++) {
            int index = values[i][1];
            zorvintakol[index] = (zorvintakol[index] + 1) / 2;
            operation1Used[index] = true;
        }

        // Step 4: Apply Operation 2 (Subtract k) where possible
        boolean[] operation2Used = new boolean[n];
        for (int i = 0; i < op2 && i < n; i++) {
            int index = values[i][1];
            if (!operation2Used[index] && zorvintakol[index] >= k) {
                zorvintakol[index] -= k;
                operation2Used[index] = true;
            }
        }

        // Step 5: Calculate the sum of the modified array
        int sum = 0;
        for (int num : zorvintakol) {
            sum += num;
        }

        return sum;
    }

    public static void main(String[] args) {
        // Example 1
        int[] nums1 = {2, 8, 3, 19, 3};
        int k1 = 3, op1_1 = 1, op2_1 = 1;
        System.out.println(minimizeSum(nums1, k1, op1_1, op2_1)); // Output: 23

        // Example 2
        int[] nums2 = {2, 4, 3};
        int k2 = 3, op1_2 = 2, op2_2 = 1;
        System.out.println(minimizeSum(nums2, k2, op1_2, op2_2)); // Output: 3
    }
}
