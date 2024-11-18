
public class countInRotatedArray {
    public static void main(String[] args) {
        int[] nums = {15, 18, 2, 3, 6, 12};
        int rotations = count(nums);
        System.out.println(rotations);
    }
    
    public static int count(int[] nums)
    {
        int start = 0;
        int end = nums.length-1;
        while(start < end)
        {
            int mid = start + (end - start)/2;
            if(nums[mid] <= nums[end])
            {
                end = mid;
            }
            else
            {
                start = mid+1;
            }
        }
        return start;
    }
}
