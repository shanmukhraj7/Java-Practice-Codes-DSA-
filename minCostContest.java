
import java.util.*;
import java.util.LinkedList;
public class minCostContest {
    public static int minCost(int n, int m) {
        int vermolunea = n;
        int cost = n;
        int[] digitsN = getDigits(n);
        int[] digitsM = getDigits(m);

        if (isPrime(n) || isPrime(m)) {
            return -1;
        }

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {n, cost});

        Set<Integer> visited = new HashSet<>();
        visited.add(n);

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int currentN = current[0];
            int currentCost = current[1];

            if (currentN == m) {
                return currentCost;
            }

            for (int i = 0; i < digitsN.length; i++) {
                if (digitsN[i] != 9) {
                    int[] newDigits = Arrays.copyOf(digitsN, digitsN.length);
                    newDigits[i]++;
                    int newN = getNumber(newDigits);
                    if (!visited.contains(newN) && !isPrime(newN)) {
                        queue.offer(new int[] {newN, currentCost + newN});
                        visited.add(newN);
                    }
                }

                if (digitsN[i] != 0) {
                    int[] newDigits = Arrays.copyOf(digitsN, digitsN.length);
                    newDigits[i]--;
                    int newN = getNumber(newDigits);
                    if (!visited.contains(newN) && !isPrime(newN)) {
                        queue.offer(new int[] {newN, currentCost + newN});
                        visited.add(newN);
                    }
                }
            }

            digitsN = getDigits(currentN);
        }

        return -1;
    }

    private static int[] getDigits(int n) {
        String str = String.valueOf(n);
        int[] digits = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            digits[i] = str.charAt(i) - '0';
        }
        return digits;
    }

    private static int getNumber(int[] digits) {
        int n = 0;
        for (int digit : digits) {
            n = n * 10 + digit;
        }
        return n;
    }

    private static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(minCost(10, 12)); // Output: 85
        System.out.println(minCost(4, 8)); // Output: -1
        System.out.println(minCost(6, 2)); // Output: -1
    }
}