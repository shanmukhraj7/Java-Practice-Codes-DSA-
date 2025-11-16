import java.util.Scanner;


public class sumAndAvgInArr{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size:");
        int N = sc.nextInt();
        int[] arr = new int[N];
        System.out.println("Enter the elements:");
        int sum = 0, avg = 0;
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        avg = sum / N;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);
        sc.close();
    }
}