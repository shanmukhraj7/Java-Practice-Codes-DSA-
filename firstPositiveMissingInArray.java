public class firstPositiveMissingInArray {
    public static int missingNumber(int[] arr) {
        // Your code here
        int n = arr.length;
        for(int i=-0; i<n; i++){
            while(arr[i]>=1 && arr[i]<=n && arr[i]!=arr[arr[i]-1]){
                int temp = arr[i];
                arr[i] = arr[temp-1];
                arr[temp-1] = temp;
            }
        }
        for(int i=0; i<n; i++){
            if(arr[i] != i+1) return i+1;
        }
        return n+1;
    }

    public static void main(String[] args) {
        int[] arr1 = {2, -3, 4, 1, 1, 7};
        System.out.println(missingNumber(arr1));
        int[] arr2 = {5, 3, 2, 5, 1};
        System.out.println(missingNumber(arr2));
        int[] arr3 = {-8, 0, -1, -4, -3};
        System.out.println(missingNumber(arr3));
    }
}
