
    // You are using Java
 public class PrimeFibonacciChecker {
    //type your code here
    public PrimeFibonacciChecker(int number, String type){
        if(type.equalsIgnoreCase("prime")){
            if(isPrime(number)) System.out.println(number + " is a prime number.");
            else System.out.println(number + " is not a prime number.");
        }
        else if(type.equalsIgnoreCase("fibonacci")){
            if(isFibonacci(number)) System.out.println(number + " is part of Fibonacci series.");
            else System.out.println(number + " is not part of the Fibonacci series.");
        }
        else System.out.println("Invalid");
    }
    
    public PrimeFibonacciChecker(int start, int end, String type){
        if(type.equalsIgnoreCase("prime")){
            String primes = findPrimesInRange(start, end);
            System.out.println("Prime numbers in the range " + start + " to " + end + ": " + primes);
        }
        else if(type.equalsIgnoreCase("fibonacci")){
            String fibonaccis = findFibonacciInRange(start, end);
            System.out.println("Fibonacci numbers in the range " + start + " to " + end + ": " + fibonaccis);
        }
        else System.out.println("Invalid");
    }
    
    private boolean isPrime(int number){
        if(number < 2) return false;
        for(int i=2; i*i<=number; i++){
            if(number%i==0) return false;
        }
        return true;
    }
    
    private boolean isFibonacci(int number){
        int a=0, b=1;
        while(b<=number){
            if(b == number) return true;
            int temp = a+b;
            a = b;
            b = temp;
        }
        return false;
    }
    
    private String findPrimesInRange(int start, int end){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i=start; i<=end; i++){
            if(isPrime(i)){
                if(sb.length() > 1) sb.append(", ");
                sb.append(i);
            }
        }
        sb.append("]");
        return sb.toString();
    }
    
    private String findFibonacciInRange(int start, int end){
        StringBuilder sb = new StringBuilder();
        int a=0, b=1;
        sb.append("[");
        while(a<=end){
            if(a>=start){
                if(sb.length() > 1) sb.append(", ");
                sb.append(a);
            }
            int temp = a+b;
            a = b;
            b = temp;
        }
        sb.append("]");
        return sb.toString();
    }
}
