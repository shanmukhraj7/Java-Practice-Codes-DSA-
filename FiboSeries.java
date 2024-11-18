public class FiboSeries {
    public static void main(String[] args) {
        int num = 10;
        for(int i=0; i<num; i++)
        {
            System.out.print(fib(i)+ " ");
        }
    }
    public static int fib(int num)
    {
        if(num <= 1) return num;
        return fib(num-1) + fib(num-2);
    }
}
