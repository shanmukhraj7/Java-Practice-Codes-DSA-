import java.util.Arrays;


public class MergeSortRecursion {
    public static void mergeSort(int[] array, int left, int right)
    {
        if(left < right)
        {
            int middle = left+(right - left)/2;
            mergeSort(array, left, middle);
            mergeSort(array, middle+1, right);
            merge(array,left,middle,right);
        }
    }

    public static void merge(int[] array, int left, int middle, int right)
    {
        int n1 = middle - left + 1;
        int n2 = right - middle;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        for(int i=0; i<n1; i++)
        {
            leftArray[i] = array[left+i];
        }

        for(int j=0; j<n2; j++)
        {
            rightArray[j] = array[middle+j+1];
        }

        int i=0, j=0;
        int k=left;

        while(i<n1 && j<n2)
        {
            if(leftArray[i] <= rightArray[j])
            {
                array[k] = leftArray[i];
                i++;
            }
            else 
            {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while(i<n1)
        {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        while(j<n2)
        {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {12,4,65,7,22,89,53};
        System.out.println("Given Array: "+Arrays.toString(arr));
        mergeSort(arr, 0, arr.length-1);
        System.out.println("After Sorting: "+Arrays.toString(arr));
    }
    
}
