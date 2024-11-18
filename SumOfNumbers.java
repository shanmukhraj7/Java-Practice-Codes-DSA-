import java.util.Scanner;


public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = calcSum(num);
        System.out.println(sum);
        sc.close();
       }

    public static int calcSum(int num)
    {
        int sum = 0;
        while(num > 0)
        {
            sum += num%10;
            num = num/10;
        }
        return sum;
    }
}
