
import java.util.Scanner; //Big O of N Square

public class BubbleSort {
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
        int temp=0;
        System.out.print("Before Sorting: ");
        for(int num: myArr)
        {
            System.out.print(num +" ");
        }

        for(int i=0; i<size; i++)
        {
            for(int j=0; j<size-i-1; j++)
            {
                if(myArr[j] > myArr[j+1])
                {
                    temp = myArr[j];
                    myArr[j] = myArr[j+1];
                    myArr[j+1] = temp;
                }
            }
        }

        System.out.println();
        System.out.print("After Sorting: ");
        for(int num: myArr)
        {
            System.out.print(num +" ");
        }

        sc.close();
    }
}
