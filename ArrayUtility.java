import java.util.Scanner;


public class ArrayUtility {
    public static int[]  inputArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        int[] myArr = new int[size];
        int i=0;
        while(i<size)
        {
            System.out.print("Enter the element "+ (i+1)+ ": ");
            myArr[i] = sc.nextInt();
            i++;
        }
        sc.close();
        return myArr;
    }

    public static void displayArray(int[] arr)
    {
        int i=0;
        while(i < arr.length)
        {
            System.out.print(arr[i] + " ");
            i++;
        }
        System.out.println();
    }
}
