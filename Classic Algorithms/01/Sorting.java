import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] bubbleInput = new int[] {5, 1, 4, 2, 8};
        int[] mergeInput = new int[] {32, 27, 43, 3, 9, 82, 10};
        bubbleSort(bubbleInput);
        System.out.println(Arrays.toString(bubbleInput));
        mergeSort(mergeInput, 0, mergeInput.length - 1);
        System.out.println(Arrays.toString(mergeInput));
    }
    private static void bubbleSort(int[] arr){
        for(int i = 0; i < arr.length - 1; i++)
            for(int j = 0; j < arr.length - i - 1; j++)
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }
    private static void mergeSort(int[] arr, int lo, int hi) {
        if(lo >= hi)
            return;
        int mid = lo + (hi-lo)/2;
        mergeSort(arr, lo, mid);
        mergeSort(arr, mid + 1, hi);
        int[] temp = Arrays.copyOf(arr, arr.length);
        int i = lo, j = mid + 1;
        for(int k = lo; k <= hi; k++) {
            if (i > mid) {
                arr[k] = temp[j];
                j++;
            } else if (j > hi) {
                arr[k] = temp[i];
                i++;
            } else if (temp[j] < temp[i]) {
                arr[k] = temp[j];
                j++;
            } else {
                arr[k] = temp[i];
                i++;
            }
        }
    }
}
