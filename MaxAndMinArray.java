public class MaxAndMinArray {
    public static void main(String[] args) {
        int[] nums = {10};
        int min = findMin(nums);
        int max = findMax(nums);
        System.out.println("Max: "+max);
        System.out.println("Min: " +min);
    }

    public static int findMin(int[] arr)
    {
        int min = arr[arr.length-1];
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] < min)
            {
                min = arr[i];
            }
        }
        return min;
    }

    public static int findMax(int[] arr)
    {
        int max = arr[0];
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
            }
        }
        return max;
    }
    
}
