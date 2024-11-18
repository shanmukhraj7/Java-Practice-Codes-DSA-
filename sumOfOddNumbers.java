import java.util.Scanner;

public class sumOfOddNumbers 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = printOddNumbers(num);
        System.out.println(sum);
        sc.close();
    }

    public static int printOddNumbers(int num)
    {
       int sum=0;
       int i=1;
        while(i<=num)
        {
            sum += i;
            i+=2;
        }
       
        return sum;
        
    }
}
