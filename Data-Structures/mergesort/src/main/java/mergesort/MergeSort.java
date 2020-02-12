package mergesort;

public class MergeSort {
    public int[] mergeSort(int[] arr) {
        int[] mainMerged = new int[arr.length];
        int n = arr.length;

        if (n > 1) {
            int mid = n / 2;
            int[] left = new int[mid];
            int[] right = new int[n - mid];

            // sort left
            left = mergeSort(left);
            // sort right
            right = mergeSort(right);

            // merge sorted left and right together
            mainMerged = mainMerge(left, right, arr);
        }
        return mainMerged;
    }

    public int[] mainMerge(int[] left, int[] right, int[] arr) {
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
            while (k != (arr.length - 1)) {
                arr[k] = right[j];
                k++;
                j++;
            }
        } else {
            while (k != (arr.length - 1)) {
                arr[k] = left[i];
                k++;
                i++;
            }
        }

        return arr;
    }
}
