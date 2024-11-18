import java.util.Scanner;

public class LinearSerach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();
        int[] myArr = new int[size];
        for(int i=0; i<size; i++)
        {
            System.out.print("Array elments" + (i+1) + ": ");
            myArr[i]=sc.nextInt();
           
        }
        System.out.println("Enter Target Element: ");
        int target = sc.nextInt();
        linearSearch(myArr, target);
        sc.close();
    }

    public static void linearSearch(int[] arr, int target)
    {
        for(int i=0; i<arr.length; i++)
        {
            if (arr[i] == target){
                System.out.println("The element is found at index "+ i );
            }
        }

    }
}
