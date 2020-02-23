package quicksort;

public class QuickSort {
    public void quickSort(int[] arr, int left, int right) {
        int position = 0;
        if (left < right) {
            position = partition(arr, left, right);

            quickSort(arr, left, position - 1);

            quickSort(arr, position + 1, right);
        }
    }

    public int partition(int[] arr, int left, int right) {
        int pivot = arr[right];

        int low = left - 1;

        for (int i = 0; i != right; i++) {
            low++;
            swap(arr, i, low);
        }

        swap(arr, right, low + 1);

        return low + 1;
    }

    public void swap(int[] arr, int i, int low) {
        int temp;
        temp = arr[i];
        arr[i] = arr[low];
        arr[low] = temp;
    }
}
