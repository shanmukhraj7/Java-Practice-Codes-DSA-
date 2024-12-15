public class BeautifulSplits {
    public static int countBeautifulSplits(int[] nums) {
        int n = nums.length;
        int count = 0;

        // Iterate over the first split point
        for (int mid1 = 1; mid1 < n - 1; mid1++) {
            // Iterate over the second split point
            for (int mid2 = mid1 + 1; mid2 < n; mid2++) {
                // nums1 is a prefix of nums2
                if (isPrefix(nums, 0, mid1, mid1, mid2) || isPrefix(nums, mid1, mid2, mid2, n)) {
                    count++;
                }
            }
        }
        return count;
    }

    // Helper function to check if nums[start1:end1] is a prefix of nums[start2:end2]
    private static boolean isPrefix(int[] nums, int start1, int end1, int start2, int end2) {
        int len1 = end1 - start1;
        int len2 = end2 - start2;

        if (len1 > len2) {
            return false; // Prefix can't be longer than the target
        }

        for (int i = 0; i < len1; i++) {
            if (nums[start1 + i] != nums[start2 + i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Example 1
        int[] nums1 = {1, 1, 2, 1};
        System.out.println(countBeautifulSplits(nums1)); // Output: 2

        // Example 2
        int[] nums2 = {1, 2, 3, 4};
        System.out.println(countBeautifulSplits(nums2)); // Output: 0
    }
}
