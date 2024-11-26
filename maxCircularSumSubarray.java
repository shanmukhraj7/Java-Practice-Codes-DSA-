public class maxCircularSumSubarray {
    public static int circularSubarraySum(int arr[]) {
        int n = arr.length;
        int currMax = 0, currMin = 0, max = arr[0], min = arr[0], total = 0;
        for(int i=0; i<n; i++){
            currMax = Math.max(currMax+arr[i], arr[i]);
            max = Math.max(max, currMax);
            currMin = Math.min(currMin+arr[i], arr[i]);
            min = Math.min(min, currMin);
            total += arr[i];
        }
        int sum = max, circ = total - min;
        if(min == total){
            return sum;
        }
        return Math.max(sum, circ);
    }
    public static void main(String[] args) {
        int[] arr1 = {8, -8, 9, -9, 10, -11, 12};
        System.out.println(circularSubarraySum(arr1));
        int[] arr2 = {10, -3, -4, 7, 6, 5, -4, -1};
        System.out.println(circularSubarraySum(arr2));
        int[] arr3 = {-1, 40, -14, 7, 6, 5, -4, -1};
        System.out.println(circularSubarraySum(arr3));
    }
}
