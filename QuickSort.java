import java.util.Scanner;

public class QuickSort {
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
        System.out.println();
        System.out.print("Before Sorting: ");
        for(int num: myArr)
        {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.print("After Sorting: ");
        quickSort(myArr, 0, myArr.length-1);
        for(int num: myArr)
        {
            System.out.print(num + " ");
        }
        sc.close();
    }

    public static void quickSort(int[] arr, int low, int high)
    {
        if(low < high)
        {
            int part = partition(arr,low,high);
            quickSort(arr, low, part-1);
            quickSort(arr, part+1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) 
    {
       int pivot = arr[high];
       int i = low-1;


       for(int j=low; j<high; j++)
       {
        if(arr[j] < pivot)
        {
            i++;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
       }
       int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;

    }


    
}
