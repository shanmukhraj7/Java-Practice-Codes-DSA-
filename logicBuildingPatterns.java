import java.util.Scanner;

public class logicBuildingPatterns {
    public static void pattern1(int n){

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print("*" + " ");
            }
            System.out.println(" ");
        }
    }

    public static void pattern2(int n){

        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
    
    public static void pattern3(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println(" ");
        }
    }    

    public static void pattern4(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(i +" ");
            }
            System.out.println(" ");
        }
    }
    
    public static void pattern5(int n){
        for(int i=n; i>=1; i--){
            for(int j=n; j>=n-i+1; j--){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
    
    public static void pattern6(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j +" ");
            }
            System.out.println(" ");
        }
    }
    
    public static void pattern7(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }
            for(int j=0; j<2*i+1; j++){
                System.out.print("*");
            }
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }

    public static void pattern8(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
            for(int j=0; j<2*n-(2*i+1) ; j++){
                System.out.print("*");
            }
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of test cases: ");        
        int t = sc.nextInt();
        while(t-- > 0){
            System.out.print("Enter number of rows: ");
            int n = sc.nextInt();
            pattern7(n);
            pattern8(n);
        }
        sc.close();
    }
}
