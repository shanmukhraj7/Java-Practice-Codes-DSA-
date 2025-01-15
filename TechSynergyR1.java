import java.util.*;

public class TechSynergyR1 {
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);

    //     // Read number of test cases
    //     int t = sc.nextInt();

    //     while (t-- > 0) {
    //         // Read size of the array
    //         int n = sc.nextInt();

    //         // Read the array
    //         int[] arr = new int[n];
    //         boolean hasNonZero = false;
    //         for (int i = 0; i < n; i++) {
    //             arr[i] = sc.nextInt();
    //             if (arr[i] != 0) {
    //                 hasNonZero = true;
    //             }
    //         }

    //         // If the array already contains only zeros
    //         if (!hasNonZero) {
    //             System.out.println(0);
    //             continue;
    //         }

    //         // Convert to a set for uniqueness
    //         Set<Integer> uniqueNumbers = new HashSet<>();
    //         for (int num : arr) {
    //             uniqueNumbers.add(num);
    //         }

    //         // If the set size is equal to the array size, MEX operation required
    //         if (uniqueNumbers.size() == n) {
    //             System.out.println(1);
    //         } else {
    //             System.out.println(2);
    //         }
    //     }

    //     sc.close();
    // } 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            for(int i = -k; i<=k; i++) set.add(num+i);
        }
        System.out.println(set.size());
        sc.close();
    }
}