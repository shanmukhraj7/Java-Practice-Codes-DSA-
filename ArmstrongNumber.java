import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean isArmstrong = isArmstrong(num);
        if(isArmstrong) System.out.println("Armstrong number found in " + num);
        else System.out.println("No Armstrong number found in " + num);
        sc.close();
    }

    public static boolean isArmstrong(int num) {
        int originalNum = num;
        int sum = 0;
        int digitCount = getDigitCount(num);
        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digitCount);
            num /= 10;
        }
        return sum == originalNum;
    }

    public static int getDigitCount(int num) {
        int count = 0;
        while (num > 0) {
            num /= 10;
            count++;
        }
        return count;
    }
}