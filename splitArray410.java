public class splitArray410 {
    public static void main(String[] args) {
        int[] myArr = {7,2,5,10,8};
        int m = 2;
        int result = splitArray(myArr, m);
        System.out.println(result);
    }

    public static int splitArray(int[] nums, int m)
    {
        int start = 0;
        int end = 0;
        for(int i=0; i<nums.length; i++)
        {
            start = Math.max(start, nums[i]); // at the end of loop it will contain max element from the array
            end += nums[i];
        }

        //binary search

        while(start < end)
        {
            int mid = start + (end-start)/2;
            int sum = 0;
            int peices = 1;
            for(int num : nums)
            {
                if(sum + num > mid)
                {
                    sum = num;
                    peices++;
                }
                else
                {
                    sum += num;
                }
            }
            if(peices > m)
            {
                start = mid+1;
            }
            else
            {
                end = mid;
            }
        }
        return end;
    }
}
