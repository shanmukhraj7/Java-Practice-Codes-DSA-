import java.util.Scanner;


public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean isPrime = isPrime(num);
        if(isPrime)
        {
            System.out.println("Prime");
        }
        else
        {
            System.out.println("Not Prime");
        }
        sc.close();
    }

    public static boolean isPrime(int num)
    {
        int i = 2;
        while(i < num)
        {
            if(num % i == 0)
            {
                return false;
            }
            i++;
        }
        return true;
    }
}
