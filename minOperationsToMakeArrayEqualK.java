import java.util.Arrays;

public class minOperationsToMakeArrayEqualK {
    public static int minOperations(int[] nums, int k) {
        if (Arrays.stream(nums).anyMatch(num -> num < k)) {
            return -1;
        }

        int max = Arrays.stream(nums).max().getAsInt();
        if (max == k) {
            return 0;
        }

        int operations = 0;
        int[] sorted = Arrays.copyOf(nums, nums.length);
        Arrays.sort(sorted);

        for (int i = sorted.length - 1; i >= 0; i--) {
            if (sorted[i] == k) {
                break;
            }
            if (i > 0 && sorted[i] == sorted[i - 1]) {
                operations++;
                sorted[i - 1] = k;
            } else {
                operations++;
            }
        }

        // If the last operation didn't make all elements equal to k, increment operations by 1
        if (sorted[0] != k) {
            operations++;
        }

        return operations;
    }

    public static void main(String[] args) {
        int[] nums1 = {5, 2, 5, 4, 5};
        int k1 = 2;
        System.out.println(minOperations(nums1, k1)); // Output: 2

        int[] nums2 = {2, 1, 2};
        int k2 = 2;
        System.out.println(minOperations(nums2, k2)); // Output: -1

        int[] nums3 = {9, 7, 5, 3};
        int k3 = 1;
        System.out.println(minOperations(nums3, k3)); // Output: 4
    }
}