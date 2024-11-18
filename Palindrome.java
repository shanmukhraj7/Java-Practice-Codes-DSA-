import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(isPalindrome(num))
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
        sc.close();
    }

    public static boolean isPalindrome(int num)
    {
        int originalNumber = num;
        int reversedNumber = 0;
        while(num > 0)
        {
            int digit = num % 10;
            reversedNumber = reversedNumber*10+digit;
            num/=10;
        }
        return originalNumber==reversedNumber;
    }

}
