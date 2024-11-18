import java.util.Scanner; //Big O of N square

public class SelectionSort {
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
        int temp = 0;
        int min = -1;
        for(int num : myArr)
        {
            System.out.print(num +" ");
        }


        for(int i=0; i<size-1; i++)
        {
            min = i;
            for(int j=i+1; j<size; j++)
            {
                if(myArr[min] > myArr[j])
                {
                    min = j;
                }
            }
            temp = myArr[min];
            myArr[min] = myArr[i];
            myArr[i] = temp;
           
        }
        System.out.println();
        System.out.print("After Sorting: ");
        for(int num: myArr)
        {
            System.out.print(num + " ");
        }

        sc.close();
    }
    
}
