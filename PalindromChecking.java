import java.util.Scanner;

public class PalindromChecking
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.println(isPalindrome(str));
        sc.close();
    }

    public static boolean isPalindrome(String str)
    {
        int start = 0;
        int end = str.length()-1;
        while(start < end)
        {
            while(start < end && Character.isLetterOrDigit(str.charAt(start)))
            {
                start++;
            }
            while(start < end && Character.isLetterOrDigit(str.charAt(end)))
            {
                end--;
            }

            char left = Character.toLowerCase(str.charAt(start));
            char right = Character.toLowerCase(str.charAt(end));
            if(left!=right) return false;
            start++;
            end--;
        }
        return true;
    }

}
