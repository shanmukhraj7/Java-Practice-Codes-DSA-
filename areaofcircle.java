import java.util.Scanner;
public class areaofcircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double pi = 3.14;
        double c = pi * a * a;
        System.out.println("Area of circle is: "+ c);
        input.close();
        System.out.println(("Input Closed"));
    }
}

