import java.util.*;

public class NeoArray{
private int[] originalArray;
private int positions;

public  ArrayRotator(int[] originalArray, int positions) {
    //type your code here
    this.originalArray = originalArray;
    this.positions = positions % originalArray.length;
}

public void printRotatedArray() {
    //type your code here
    int n = originalArray.length;
    int[] rotatedArray = new int[n];
    for(int i=0; i<n; i++){
        rotatedArray[(i+positions)%n] = originalArray[i];
    }
    for(int num : rotatedArray) System.out.print(num + " ");
}

public static void main(String[] args) {
    //type your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] nums = new int[n];
    for(int i=0; i<n; i++){
        nums[i] = sc.nextInt();
    }
    int m = sc.nextInt();
    ArrayRotator rot = new ArrayRotator(nums, m);
    rot.printRotatedArray();
    sc.close();
}
}