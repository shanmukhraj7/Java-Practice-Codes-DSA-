public class peakIndex {
    public static void main(String[] args) {
        int[] myArr = {1,2,1,3,5,6,4};
        int max = maxIndex(myArr);
        System.out.println(max);
       
    }

    public static int maxIndex(int[] myArr)
    {
        int start = 0;
        int end = myArr.length - 1;
        while(start <= end)
        {
            int mid = start + (end - start)/2;
            if((mid == 0 || myArr[mid] > myArr[mid+1]) &&(mid == myArr.length-1 || myArr[mid] > myArr[mid-1]))
            {
                return mid;
            }
            else if(myArr[mid-1] > myArr[mid])
            {
                end = mid-1;
            }
            else
            {
                start = mid+1;
            }
        }
        return -1;
    }
}
