import java.util.Arrays;

public class CircularArrayMapping {
    public static int[] circularArrayResult(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                result[i] = nums[i];
            } else {
                int steps = nums[i];
                // Handle circular movement using modulo operation
                int newIndex = (i + steps) % n;
                if (newIndex < 0) {
                    newIndex += n; // Adjust for negative index
                }
                result[i] = nums[newIndex];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        // Test cases
        int[] nums1 = {3, -2, 1, 1};
        int[] nums2 = {-1, 4, -1};

        System.out.println("Input: " + Arrays.toString(nums1));
        System.out.println("Output: " + Arrays.toString(circularArrayResult(nums1)));

        System.out.println("Input: " + Arrays.toString(nums2));
        System.out.println("Output: " + Arrays.toString(circularArrayResult(nums2)));
    }
}
