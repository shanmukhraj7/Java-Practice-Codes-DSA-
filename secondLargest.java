public class secondLargest {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int secondLargest = findSecondLargest(nums);
        if(secondLargest != Integer.MIN_VALUE)
        {
            System.out.println(secondLargest);
        }
        else
        {
            System.out.println("No second largest element found.");
        }

    }
    public static int findSecondLargest(int[] nums) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int num: nums)
        {
            if(num > largest)
            {
                secondLargest = largest;
                largest = num;
            }
            else if(num > secondLargest && num < largest)
            {
                secondLargest = num;
            }
        }
        return secondLargest;
    }
}
