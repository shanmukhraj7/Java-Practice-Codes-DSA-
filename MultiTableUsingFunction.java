import java.util.Scanner;

public class MultiTableUsingFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        printMultiplication(num);
       sc.close();
    }

    public static void printMultiplication(int num)
    {
        int i=1;
        while(i<=10)
        {
            System.out.println(num + "X" + i + "=" + (num*i));
            i++;
        }
    }
}