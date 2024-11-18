import java.util.Scanner;

public class primeNumberVerification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        System.out.println(isPrime(num));
        sc.close();

    }

    public static boolean isPrime(int num) {
        if(num <= 1) return false;
        if(num % 2 == 0) return false;
        if(num == 2) return true;
        for(int i = 3; i<Math.sqrt(num); i+=2)
        {
            if(num % i == 0) return false;
        }
        return true;
    }
}
