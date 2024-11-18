public class MethodOrFunctions {
    public static void main(String[] args) 
    {
        RHP();
        // LHP();
        // IRHP();
    }

    public static void RHP()
    {
        int rows = 0;
        while(rows<5)
        {
            System.out.print("*");
            int i = 0;
            while(i<rows)
            {
                System.out.print(" *");
                i++;
            }
            System.out.println();
            rows++;
        }
    }

    // public static void LHP()
    // {
    //     System.out.println("    *");
    //     System.out.println("   **");
    //     System.out.println("  ***");
    //     System.out.println(" ****");
    //     System.out.println("*****\n\n");
    // }

    // public static void IRHP()
    // {
    //     System.out.println("*****");
    //     System.out.println("****");
    //     System.out.println("***");
    //     System.out.println("**");
    //     System.out.println("*");
    // }

}