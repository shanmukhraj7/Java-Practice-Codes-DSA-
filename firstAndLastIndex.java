// Leetcode 34


public class firstAndLastIndex {
    public static void main(String[] args) {
        
    }

    public static int[] searchRange(int[] nums, int target)
    {
        int[] ans = {-1,-1};
        ans[0] = search(nums, target, true);
        if(ans[0] != -1)
        {
            ans[1] = search(nums, target, false);
        }
       
        return ans;

    }
    public static int search(int[] myArr, int target, boolean findSearchIndex)
    {
        int ans = -1;
        int start = 0;
        int end = myArr.length-1;
        while(start <= end)
        {
            int mid = start + (end - start)/2;
            if(myArr[mid] < target)
            {
                start = mid+1;
            }
            else if(myArr[mid] > target)
            {
                end = mid-1;
            }
            else
            {
                ans = mid;
                if(findSearchIndex)
                {
                    end = mid-1;
                }
                else
                {
                    start = mid+1;
                }
            }
        }
        return ans;

    }
}
