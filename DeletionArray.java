
import java.util.Scanner;

public class DeletionArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] myArr = ArrayUtility.inputArray();
        System.out.print("Number to delete: ");
        int num = sc.nextInt();
        int[] newArr = deletion(myArr, num);
        System.out.println("New Array is: ");
        ArrayUtility.displayArray(newArr);
        sc.close();
        

    }

    public static int[] deletion(int[] arr, int num)
    {
        int count = RepetetionOfAnElement.Repetetion(arr, num);
        if(count == 0) return arr;
        int newSize = arr.length - count;
        int[] newArr = new int[newSize];
        
        int i=0,j=0;
        while(i < arr.length)
        {
            if(arr[i] != num)
            {
                newArr[j] = arr[i];
                j++;
            }
            i++;
        }
        return newArr;
    }

    
}
