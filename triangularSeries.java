import java.util.*;

public class triangularSeries {

    public static int triangularSeriesCount(int n){
        if(n == 1) return 1;
        return triangularSeriesCount(n-1) + n; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(triangularSeriesCount(n));
        sc.close();
    }
}
