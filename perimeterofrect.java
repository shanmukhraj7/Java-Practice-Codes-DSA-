import java.util.Scanner;
public class perimeterofrect {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length: ");
        int length = input.nextInt();
        System.out.println("Enter the Breadth: ");
        int breadth = input.nextInt();
        int perimeter = 2*(length + breadth);
        System.out.println("Perimeter of the Rect is: " + perimeter);
        input.close();
    }
}
