
//33 leetcode


public class rotatedArray {
    public static void main(String[] args) {
        int[] myArr = {4,5,6,7,0,1,2};
        int target = 0;
        int result = searchInRotatedArray(myArr, target);
        System.out.println(result);
    }

    public static int searchInRotatedArray(int[] myArr, int target)
    {
        int start = 0;
        int end = myArr.length - 1;
        while(start <= end)
        {
            int mid = start + (end - start)/2;
            if(myArr[mid] == target)
            {
                return mid;
            }

            if(myArr[start] == myArr[mid] && myArr[mid] == myArr[end])
            {
                start++;
                end--;
            }
            else if(myArr[mid] >= myArr[start])
            {
                if (myArr[start] <= target && target <= myArr[mid])
                {
                    end = mid - 1;
                }
                else
                {
                    start = mid + 1;
                }
            }
            else
            {
                if(myArr[mid] <= target && target <= myArr[end])
                {
                    start = mid + 1;
                }
                else
                {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

    
}
