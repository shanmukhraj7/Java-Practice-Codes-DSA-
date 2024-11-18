public class SortedArray {
    public static void main(String[] args) {
        System.out.println("Welcome to Sorted Array\n");
        int[] myArr = ArrayUtility.inputArray();
        boolean isInc = isIncreasing(myArr);
        boolean isDec = isDecreasing(myArr);
        if(isInc || isDec)
        {
            System.out.println("Array is Sorted");
        }
        else
        {
            System.out.println("Array is not Sorted");
        }
        

    }

    public static boolean isDecreasing(int[] myArr)
    {
        int i=1;
        while(i < myArr.length)
        {
            if(myArr[i] > myArr[i-1])
            {
                return false;
            }   
            i++;
        }
        return true;
    }

    public static boolean isIncreasing(int[] myArr)
    {
        int i=1;
        while(i < myArr.length)
        {
            if(myArr[i] < myArr[i-1])
            {
                return false;
            }
            i++;
        }
        return true;
    }
}
