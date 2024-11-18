public class ArraySum 
{
    public static void main(String[] args) 
    {
       System.out.println("Array Sum and Average");
        int[] numArray = ArrayUtility.inputArray();
        long sum = Sum(numArray);
        double Avg = Average(numArray);
        System.out.println("Sum is: "+ sum);
        System.out.println("Average is: "+Avg);


    }

    public static long Sum(int[] numArray)
    {
        long sum = 0;
        int i=0;
        while(i < numArray.length)
        {
            sum += numArray[i];
            i++;
        }
        
        return sum;
    }

    public static double Average(int[] numArray)
    {
        double sum = Sum(numArray);
        return (sum/numArray.length);
    
    }

    
}


    
