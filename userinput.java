import java.util.Scanner;
public class userinput{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = input.nextLine();
        System.out.println("Welcome "+ name +" to KG Coding");
        input.close();
    }
}