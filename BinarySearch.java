
import java.util.Scanner;

public class BinarySearch{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = sc.nextInt();
        int[] myArr = new int[size];
        for(int i=0; i<size; i++)
        {
            System.out.print("Enter the element "+ (i+1) +": ");
            myArr[i]=sc.nextInt();
        }
        System.out.print ("Enter the target element: ");
        int target = sc.nextInt();

        int result = Binary(myArr, target, 0, size-1);
        if(result != -1)
        {
            System.out.println("The element is found at index "+ result);
        }
        else
        {
            System.out.println("The element is not found");
        }
        sc.close();

    }

    public static int Binary(int[] arr, int target, int right, int left)
    {
        left = 0;
        right = arr.length-1;
        int steps = 0;

        while(left <= right)
        {
            steps++;
            int mid = (left+right)/2;
            if(arr[mid]==target)
            {
                System.out.println("No of steps: " + steps);
                return mid;
            }
            else if(arr[mid] < target)
            {
                left = mid+1;
            }
            else
            {
                right = mid-1;
            }
        }
        return -1;
    }
}