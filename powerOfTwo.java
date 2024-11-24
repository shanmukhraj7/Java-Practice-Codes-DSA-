public class powerOfTwo {
    public static int findMaxX(int n) {
        // code here
        int x=0;
        while((1<<x) <= n) x++;
        x--;
        return x;
    }
    public static void main(String[] args) {
        int n = 8;
        System.out.println(findMaxX(n));
    }
    
}
