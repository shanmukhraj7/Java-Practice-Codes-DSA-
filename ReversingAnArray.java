import java.util.Scanner;

public class ReversingAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] myArr = ArrayUtility.inputArray();
        ArrayUtility.displayArray(myArr);
        Reverse(myArr);
        System.out.print("After Reversing the Array: ");
        ArrayUtility.displayArray(myArr);
        sc.close();
    }

    public static void Reverse(int[] arr)
    {
        int i = 0 ;
        while(i < arr.length / 2) 
        {
            int swap = arr[i];
            arr[i] = arr[(arr.length-1)-i];
            arr[(arr.length-1)-i] = swap;
            i++;
        }
    }
}
