public class BinarySearchRecursive {
    public static void main(String[] args) {
        int[] array = {22,45,66,76,78,98};
        int result = binarySearch(array,22, 0, array.length-1);
        if(result != -1)
        {
            System.out.println("The element is found at index "+ result);
        }
        else
        {
            System.out.println("The element is not found");
        }
    }

    public static int binarySearch(int[] arr, int target, int left, int right) {
        if(left > right) {
            return -1;
        }
        int mid = left + (right - left) / 2;
        if(arr[mid] == target) {
            return mid;
        }
        if(arr[mid] > target) {
            return binarySearch(arr, target, left, mid - 1);
        }
        return binarySearch(arr, target, mid + 1, right);
    }
}
