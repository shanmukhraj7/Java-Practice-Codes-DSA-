public class slidingWindow {
    static void calcSum(int[] arr, int n, int k)
    {
        int sum =0, start=0, end=0;
        while(end<n){
            sum+=arr[end];
            if(end-start+1 < k)
            {
                end++;
            }
            else
            {
                System.out.print(sum +" ");
                sum-=arr[start];
                start++;
                end++;
            }
        }

    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int n = arr.length;
        int k=3;

        calcSum(arr, n, k);
    }
    
}
