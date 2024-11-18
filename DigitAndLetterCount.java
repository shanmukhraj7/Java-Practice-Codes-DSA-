import java.util.Scanner;

public class DigitAndLetterCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.nextLine();
        Count(str);
        sc.close();
    }

    public static void Count(String str)
    {
        int digitCount = 0;
        int letterCount = 0;
        for(int i=0; i<str.length(); i++)
        {
            char ch = str.charAt(i);
            if(Character.isDigit(ch))
            {
                digitCount++;
            }
            else if(Character.isLetter(ch))
            {
                letterCount++;
            }
        }
        System.out.println("Letter count: "+letterCount);
        System.out.println("Digit count: "+digitCount);
    }
}
