import java.util.*;

public class largestDivisibleSubset {
    public static List<Integer> LDS(int[] nums){
        List<Integer> res = new ArrayList<>();
        int n = nums.length;
        int[] dp = new int[n];
        int[] prev = new int[n];
        Arrays.sort(nums);
        Arrays.fill(dp, 1);
        Arrays.fill(prev, -1);
        int max = 1, maxIdx = 0;
        for(int i=1; i<n; i++){
            for(int j=0; j<i; j++){
                if(nums[i] % nums[j] == 0 && dp[i] < dp[j] + 1){
                    dp[i] = dp[j] + 1;
                    prev[i] = j;
                }
            }if(dp[i] > max){
                max = dp[i];
                maxIdx = i;
            }
        }
        while(maxIdx != -1){
            res.add(nums[maxIdx]);
            maxIdx = prev[maxIdx];
        }
        Collections.reverse(res);
        return res;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,4,8};
        System.out.println(LDS(nums1));

        int[] nums2 = {1,2,3};
        System.out.println(LDS(nums2));
    }
}
