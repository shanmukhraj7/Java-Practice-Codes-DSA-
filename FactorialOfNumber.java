import java.util.Scanner;
public class FactorialOfNumber 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        long fact = calcFactorial(num);
        System.out.println(fact);
        sc.close();
    }

    public static long calcFactorial(int num)
    {
        if(num < 2)
        {
            return 1;
        }
        long fact = 1;
        int i = 2;
        while (i <= num ) {
            fact *= i;
            i++;
        }
        return fact;
    }
}
