public class Parameters {
    public static void main(String[] args) {
        System.out.println(sumOfTwo(10, 20));
        System.out.println(sumOfTwo(6, 5));
        System.out.println(sumOfTwo(1, 0));
        System.out.println(sumOfTwo(-9,9));

    }

    public static int sumOfTwo(int a, int b)
    {
        int sum = a+b;
        return sum;
    }
}


/*  Parameters are given when declaring a function AND Arguments are actual values given to when calling the functions*/