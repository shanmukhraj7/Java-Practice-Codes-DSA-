public class minimumSizedSubarraySum {
    public static int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int start=0, end=0, sumOfCurrent=0;
        int res = Integer.MAX_VALUE;
        for(end=0; end<n; end++){
            sumOfCurrent += nums[end];
            while(sumOfCurrent >= target){
                res = Math.min(res,end-start+1);
                sumOfCurrent -= nums[start++];
            }
        }
        return res == Integer.MAX_VALUE ? 0 : res;
    }
    public static void main(String[] args) {
        int target1 = 7;
        int[] nums1 = {2,3,1,2,4,3};
        System.out.println(minSubArrayLen(target1, nums1));
        int target2 = 4;
        int[] nums2 = {1,4,4};
        System.out.println(minSubArrayLen(target2, nums2));  
        int target3 = 11;
        int[] nums3 = {1,1,1,1,1,1,1,1};
        System.out.println(minSubArrayLen(target3, nums3));
    }
}
