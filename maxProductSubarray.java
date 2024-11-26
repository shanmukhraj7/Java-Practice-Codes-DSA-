public class maxProductSubarray {
    static int maxProduct(int[] arr) {
        int start = 1, end = 1, maxPro = Integer.MIN_VALUE;
            int n = arr.length;
            for(int i=0; i<n; i++){
                if(start == 0) start = 1;
                if(end == 0) end = 1;
                start *= arr[i];
                end *= arr[n-i-1];
                maxPro = Math.max(maxPro,start);
                maxPro = Math.max(maxPro,end);
            }
            return maxPro;
    }

    public static void main(String[] args) {
        int arr1[] = {-2, 6, -3, -10, 0, 2};
        System.out.println(maxProduct(arr1));
        int arr2[] = {-1, -3, -10, 0, 6};
        System.out.println(maxProduct(arr2));
        int arr3[] = {2, 3, 4}; 
        System.out.println(maxProduct(arr3));
    }
}
