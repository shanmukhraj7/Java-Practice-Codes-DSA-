import java.util.Arrays;

public class MinimizeHeights {
    public static int getMinDiff(int[] arr, int k) {
        // code here
        int n = arr.length;
        if(n == 1) return 0;
        Arrays.sort(arr);
        int res = arr[n-1] - arr[0];
        int l = arr[n-1]-k, s = arr[0]+k;
        for(int i=0; i<n-1; i++){
            int max = Math.max(arr[i]+k, l);
            int min = Math.min(arr[i+1]-k, s);
            if(min<0) continue;
            res = Math.min(res, max-min);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {3, 9, 12, 16, 20};
        int k = 3;
        System.out.println(getMinDiff(arr,k));
    }
}
