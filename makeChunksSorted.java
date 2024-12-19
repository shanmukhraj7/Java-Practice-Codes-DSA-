public class makeChunksSorted {
    public static int maxChunksToSorted(int[] arr) {
        int n = arr.length;
        int maxs=-1, cnt=0;
        for(int i=0;i<n;i++){
            maxs=Math.max(maxs,arr[i]);
            if(maxs==i) cnt++;
        }
        return cnt;
    }
    public static void main(String[] args) {
        int[] arr1 = {4,3,2,1,0};
        System.out.println(maxChunksToSorted(arr1));

        int[] arr2 = {1,0,2,3,4};
        System.out.println(maxChunksToSorted(arr2));
    }
}
