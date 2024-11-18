
import java.util.Scanner;

public class ArrayTraversal
 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]arr={1,2,3,4,5,8,9,10,11,12};
        int target = sc.nextInt();
        boolean isFound = isFound(arr, target);
        if(isFound)
        {
            System.out.println("Found the "+target);
        }
        else
        {
            System.out.println("Not Found the "+target);
        }
        sc.close();
    }

    public static boolean isFound(int[] arr, int target)
    {
        int i=0;
        while(i < arr.length)
        {
            if(arr[i]==target)
            {
                return true;
            }
            i++;
        }
        return false;
    }
}
