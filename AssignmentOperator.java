import java.util.Scanner;

public class AssignmentOperator{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Swapping of Two Numbers\n\n");


        System.out.print("Enter First Number: ");
        int firstNumber = input.nextInt();


        System.out.print("Enter Second Number: ");
        int secondNumber = input.nextInt();


        int temp = firstNumber;
        firstNumber = secondNumber;
        secondNumber = temp;


        System.out.println("After swapping the Number");


        System.out.println("The First Number is: " + firstNumber);
        System.out.println(("The Second Number is: " + secondNumber));

        
        input.close();;
    }
}