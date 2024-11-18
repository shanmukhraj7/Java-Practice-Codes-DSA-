import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i=1;
        while(num>0)
        {
            while(i<=10)
            {
                System.out.println(num*i);
                i++;
            }
        }
        sc.close();
    }
}





