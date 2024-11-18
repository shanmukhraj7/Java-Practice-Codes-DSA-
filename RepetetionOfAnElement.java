import java.util.Scanner;

public class RepetetionOfAnElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] myArr = ArrayUtility.inputArray();
        System.out.print("To find: ");
        int num = sc.nextInt();
        int Repetetion = Repetetion(myArr,num);
        System.out.println("The number has repeted "+ Repetetion +" times int the array");
        sc.close();
    }

    public static int Repetetion(int[] myArr, int num)
    {
        int count = 0;
        int i=0;
        while(i < myArr.length)
        {
            if(myArr[i] == num)
            {
                count++;
            }
            i++;
        }
        return count;
    }
}
