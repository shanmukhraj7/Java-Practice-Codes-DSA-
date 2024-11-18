import java.util.Arrays;

public class removeDuplicateArray {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int[] result = removeDuplicates(nums);
        for(int num : result) {
            System.out.print(num + " ");
        }
    }

    public static int[] removeDuplicates(int[] nums) {
        int n = nums.length;
        if(n == 0 || n==1) return nums;

       int j = 0;
        for(int i = 1; i < n; i++) {
            if(nums[i]!=nums[j]) {
                j++;
                nums[j] = nums[i];
            }
        }
        return Arrays.copyOf(nums, j+1);
    }
}
