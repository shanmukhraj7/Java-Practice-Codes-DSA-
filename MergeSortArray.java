import java.util.Scanner;

public class MergeSortArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = sc.nextInt();
        int[] myArr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the element " + (i + 1) + ": ");
            myArr[i] = sc.nextInt();
        }

        System.out.println();
        System.out.print("Before Sorting: ");
        for (int num : myArr) {
            System.out.print(num + " ");
        }

        System.out.println();
        System.out.print("After Sorting: ");
        MergeSort(myArr, 0, myArr.length - 1); 
        for (int num : myArr) {
            System.out.print(num + " ");
        }
        sc.close();
    }

    private static void MergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int mid = (l + r) / 2;
            MergeSort(arr, l, mid); 
            MergeSort(arr, mid + 1, r); 
            merge(arr, l, mid, r); 
        }
    }

    private static void merge(int[] arr, int l, int mid, int r) {
        int n1 = mid - l + 1; 
        int n2 = r - mid; 

        int[] leftArr = new int[n1]; 
        int[] rightArr = new int[n2];

        
        for (int i = 0; i < n1; i++) {
            leftArr[i] = arr[l + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArr[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0, k = l; 

        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        
        while (i < n1) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }

     
        while (j < n2) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }
}