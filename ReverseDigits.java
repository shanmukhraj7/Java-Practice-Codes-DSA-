import java.util.Scanner;

public class ReverseDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int reverse = reverse(num);
        System.out.println(reverse);
        sc.close();
    }

    public static int reverse(int num)
    {
        int newNum = 0;
        while(num>0)
        {
            int digit = num%10;
            newNum = newNum * 10 + digit;
            num /= 10;
        }
        return newNum;
    }
}
