import java.util.*;

public class maxSubArraySumContest {
    public static long maxSubarraySum(int[] nums, int k) {
        long maxSum = Long.MIN_VALUE; // Initialize the maximum sum
        Map<Integer, Long> prefixModToSum = new HashMap<>(); // Maps prefix mod value to the smallest prefix sum
        prefixModToSum.put(0, 0L); // To account for subarrays starting from index 0
        long prefixSum = 0;

        for (int i = 0; i < nums.length; ++i) {
            prefixSum += nums[i]; // Update the running prefix sum
            int mod = (i + 1) % k; // Calculate the current length mod k

            // If there exists a prefix that ensures the subarray length is divisible by k
            if (prefixModToSum.containsKey(mod)) {
                maxSum = Math.max(maxSum, prefixSum - prefixModToSum.get(mod));
            }

            // Update prefixModToSum to maintain the smallest prefix sum for each mod value
            if (!prefixModToSum.containsKey(mod)) {
                prefixModToSum.put(mod, prefixSum);
            } else {
                prefixModToSum.put(mod, Math.min(prefixModToSum.get(mod), prefixSum));
            }
        }

        return maxSum;
    }


    public static void main(String[] args) {
        int[] nums1 = {1,2};
        int k1 = 1;
        System.out.println(maxSubarraySum(nums1, k1)); 

        int[] nums2 = {-1,-2,-3,-4,-5};
        int k2 = 4;
        System.out.println(maxSubarraySum(nums2, k2));

        int[] nums3 = {-5,1,2,-3,4};
        int k3 = 2;
        System.out.println(maxSubarraySum(nums3, k3));
    }
    
}
