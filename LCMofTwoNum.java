import java.util.Scanner;

public class LCMofTwoNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int Lcm = LCM(num1,num2);
        System.out.println(Lcm);
        sc.close();
    }

    public static int LCM(int num1, int num2)
    {
        int i = 1;
        while(i <= num2)
        {
            int factor = num1 * i;
            if(factor % num2 == 0)
            {
                return factor;
            }
            i++;
        }
        return 0;
    }
}
