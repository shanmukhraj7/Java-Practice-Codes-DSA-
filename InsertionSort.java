import java.util.Scanner;

public class InsertionSort {
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

        for(int i=1; i<myArr.length; i++)
        {
            int key = myArr[i];
            int j = i-1;
            while(j >= 0 && myArr[j] > key)
            {
                myArr[j+1] = myArr[j];
                j--;
            } 
            myArr[j+1] = key;
        }

        for(int num: myArr)
        {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
