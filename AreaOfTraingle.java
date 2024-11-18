import java.util.Scanner;
public class AreaOfTraingle 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        float base = sc.nextFloat();
        float height = sc.nextFloat();
        float area = 0.5f * base * height;
        System.out.println(area);
        sc.close();
    }
}
