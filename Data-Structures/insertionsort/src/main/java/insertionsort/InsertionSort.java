package insertionsort;

public class InsertionSort {
    public int[] insertion(int[] arr) {
        if (arr.length == 0) {
            throw new ArrayIndexOutOfBoundsException("Array is empty");
        }
        for (int i = 1; i < arr.length; i++) {
            int j = i - 1;
            int temp = arr[i];

            while (j >= 0 && temp < arr[j]) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }

            arr[j + 1] = temp;
        }
        return arr;
    }
}
