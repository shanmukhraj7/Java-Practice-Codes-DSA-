import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        System.out.print("Enter target char: ");
        char target = sc.next().charAt(0);
        int count = Count(str,target);
        System.out.println(count);
        sc.close();
    }

    public static int Count(String str, char target) {
        int count  = 0;
        for(int i=0; i<str.length(); i++)
        {
            if(str.charAt(i) == target)
            {
                count++;
            }
        }
        return count;
    }
}
