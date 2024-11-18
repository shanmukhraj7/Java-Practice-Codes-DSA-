import java.util.Scanner;

public class FibbonaciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        for(int i=0; i<num; i++)
        {
            sum += fibbi(i);
        }
        System.out.print(sum);
        sc.close();
    }

    public static int  fibbi(int num)
    { 
        if(num <= 1)
        {
            return num;
        }
        return fibbi(num-1) + fibbi(num-2);
        
    }
}
