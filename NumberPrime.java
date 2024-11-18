public class NumberPrime {
    public static void main(String[] args) {
        int num = 40;
        for(int i=2; i<=num; i++){
            if(isPrime(i)) System.out.print(i + " ");
        }
    }

    public static boolean isPrime(int num) {
        if(num <= 1) return false;
        for(int i=2; i<=Math.sqrt(num); i++){
            if(num % i == 0) return false;
        }
        return true;
    }
}
