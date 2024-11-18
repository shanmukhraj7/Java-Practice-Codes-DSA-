public class floorOfArray {
    public static void main(String[] args) {
        int[] myArr = {2,3,5,9,14,16,18};
        int target = 13;
        int floor = findFloor(myArr, target);
        System.out.println(floor);
    }

    public static int findFloor(int[] myArr, int target)
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
                start = mid + 1;
            }
            else
            {
                end = mid - 1;
            }
        }
        return myArr[end];
    }
}
