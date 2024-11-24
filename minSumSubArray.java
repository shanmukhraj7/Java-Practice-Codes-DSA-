import java.util.*;

public class minSumSubArray{

    public static int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n = nums.size();
        int min = Integer.MAX_VALUE;
        boolean flag = false;
        for(int i=0; i<n; i++){
            int s=0;
            for(int j=i; j<n && (j-i+1)<=r; j++){
                s+=nums.get(j);
                if((j-i+1)>=l && s>0){
                    min = Math.min(min,s);
                    flag = true;
                }
            }
        }
        return flag? min : -1;
    }

    public static void main(String[] args) {
        List<Integer> nums1 = Arrays.asList(3,-2,1,4);
        int l1=2, r1=3;
        System.out.println(minimumSumSubarray(nums1,l1,r1));

        List<Integer> nums2 = Arrays.asList(1,2,3,4);
        int l2=2, r2=4;
        System.out.println(minimumSumSubarray(nums2,l2,r2));
    }
}