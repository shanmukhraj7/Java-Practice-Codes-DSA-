import java.util.Scanner;

public class StringReversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        String reversed = reverseString(str);
        System.out.println("Reversed string: " + reversed);
        sc.close();
    }

    // public static String reverseString(String str) {
    //     StringBuilder sb = new StringBuilder(str);
    //     return sb.reverse().toString();
    // }

    public static String reverseString(String str) {
        if(str.length() > 1000 || str.length() < 1)
        {
            System.out.println("Invalid String");
        }

        char[] reversedArray = new char[str.length()];
        int j = 0;
        for(int i = str.length()-1; i>=0; i--)
        {
            reversedArray[j] = str.charAt(i);
            j++;
        }
        return new String(reversedArray);
    }
    
}
