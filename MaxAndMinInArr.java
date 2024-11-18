public class MaxAndMinInArr {
    public static void main(String[] args) {
        System.out.println("Min and Max of Elements");
        int[] myArr = ArrayUtility.inputArray();
        
        int Max = max(myArr);
        int Min = min(myArr);
        System.out.println("Max element is: "+ Max);
        System.out.println("Min element is: "+ Min);
    }

    public static int min(int[] myArr)
    {
       
        int min = Integer.MAX_VALUE;
        int i=0;
        while(i < myArr.length)
        {
            if(min > myArr[i])
            {
                min = myArr[i];
            }
            i++;
        }
        return min;
    }


    public static int max(int[] myArr)
    {
        if(myArr.length == 0)
        {
            return Integer.MIN_VALUE;
        }
        
        int max=myArr[0];
        int i=1;
        while(i < myArr.length)
        {
            if(max < myArr[i])
            {
                max = myArr[i];
            }
            i++;
        }
        return max;

    }
}


