import java.util.Arrays;

public class MinimizeHeightsGFG {
    public static int getMinDiff(int k, int[] arr) {
        // code here
        int n = arr.length;
        if(n == 1) return 0;
        Arrays.sort(arr);
        int res = arr[n-1] - arr[0];
        int l = arr[n-1] - k, s = arr[0] + k;
        for(int i=0; i<n-1; i++){
            int max = Math.max(arr[i]+k, l);
            int min = Math.min(arr[i+1]-k, s);

            res = Math.min(res, max - min);
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = {1, 5, 8, 10};
        int k = 2;
        System.out.println(getMinDiff(k, arr));
    }
}

