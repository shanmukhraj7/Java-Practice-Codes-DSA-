
public class ceilingOfArray {
    public static void main(String[] args) {
        int[] myArr = {2,3,5,9,14,16,18};
        int target = 11;
        int ceiling = findCeiling(myArr, target);
        System.out.println(ceiling);
    }

    public static int findCeiling(int[] myArr, int target)
    {
        int start = 0;
        int end = myArr.length-1;
        while(start <= end)
        {
            int mid = start + (end - start)/2;
            if(myArr[mid] == target)
            {
                return myArr[mid];
            }
            else if(myArr[mid] < target)
            {
                start = mid+1;
            }
            else
            {
                end = mid-1;
            }
        }
        return myArr[start];
    }
    
}
