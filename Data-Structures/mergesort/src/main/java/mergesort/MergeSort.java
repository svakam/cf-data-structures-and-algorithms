package mergesort;

import java.util.Arrays;

public class MergeSort {
    public void mergeSort(int[] arr) {
        if (arr.length == 0) {
            throw new ArrayIndexOutOfBoundsException("Array is empty");
        }

        int n = arr.length;

        if (n > 1) {
            int mid = n / 2;
            int[] left = Arrays.copyOfRange(arr, 0, mid);
            int[] right = Arrays.copyOfRange(arr, mid, n);

            // sort left
            mergeSort(left);
            // sort right
            mergeSort(right);

            // merge sorted left and right together
            mainMerge(left, right, arr);
        }
    }

    public void mainMerge(int[] left, int[] right, int[] arr) {
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i = i + 1;
            } else {
                arr[k] = right[j];
                j = j + 1;
            }

            k = k + 1;
        }

        // if left has been iterated fully, set parent arr values to remaining values in right, else parent arr values to remaining left
        if (i == left.length) {
            while (k < arr.length) {
                arr[k] = right[j];
                k++;
                j++;
            }
        } else {
            while (k < arr.length) {
                arr[k] = left[i];
                k++;
                i++;
            }
        }
    }
}
