import java.util.Scanner;
public class NumberChecking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a>0)
        {
            System.out.println("positive");
        }
        else if (a<0)
        {
            System.out.println("Negative");
        }
        else
        {
            System.out.println("Zero");
        }
        sc.close();
    }
}
