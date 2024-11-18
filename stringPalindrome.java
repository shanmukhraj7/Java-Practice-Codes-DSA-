import java.util.Scanner;

public class stringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(isPalindrome(str));
        sc.close();
    }

    static boolean isPalindrome(String str)
    {
        for(int i=0; i<str.length()/2; i++)
        {
            char start = str.charAt(i);
            char end = str.charAt(str.length()-1-i);
            if(start != end)
            {
                return false;
            }
        }
        return true;

    }
}
