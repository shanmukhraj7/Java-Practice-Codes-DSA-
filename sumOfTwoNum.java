import java.util.Scanner;
public class sumOfTwoNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = a + b;
        System.out.println("Sum of two numbers is: " + c);
        input.close();
    }
}
