import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum = NaturalNumbersSum(number);
        System.out.println(sum);
        sc.close();
    }
    public static int NaturalNumbersSum(int number)
    {
        int sum = 0;
        for(int i=0; i<=number; i++)
        {
            sum += i;
        }
        return sum;
    }
    
}
