// import java.util.Scanner;

// public class GradeSystemUsingIfElse {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int  Number = sc.nextInt();
//         if(Number >=90 && Number <=100)
//         {
//             System.out.println("Grade is A");
//         } 
//         else if(Number >= 75 && Number <=89)
//         {
//             System.out.println("Grade is B");
//         }
//         else if(Number >=60 && Number <=74)
//         {
//             System.out.println("Grade is C");
//         }
//         else if(Number >=30 && Number <=59)
//         {
//             System.out.println("Grade is D");
//         }
//         else
//         {
//             System.out.println("Grade is F");
//         }
//         sc.close();
//     }
// }


import java.util.Scanner;
public class Age{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age>=60){
            System.out.println("Senior");
        }
        else if(age<=60 && age>=21){
            System.out.println("Adult");
        }
        else if(age<=20 && age>=13)
        {
            System.out.println("Teen");
        }
        else
        {
            System.out.println("Child");
        }
        sc.close();

    }
}
