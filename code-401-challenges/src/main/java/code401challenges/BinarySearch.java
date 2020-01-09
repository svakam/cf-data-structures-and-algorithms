package code401challenges;

public class BinarySearch {
    public static int findIntegerInArray(int[] array, int searchKey) {
        int leftBoundIndex = 0;
        int rightBoundIndex = array.length - 1;
        int indexOfMidPointOfArray;
        if (array.length > 0) {
            do {
                indexOfMidPointOfArray = getIndexOfMidpoint(leftBoundIndex, rightBoundIndex);
                if (searchKey > array[indexOfMidPointOfArray]) {
                       if (rightBoundIndex - leftBoundIndex == 1) {
                           indexOfMidPointOfArray++;
                       }
                       leftBoundIndex = indexOfMidPointOfArray;
                } else if (searchKey < array[indexOfMidPointOfArray]) {
                    if (rightBoundIndex - leftBoundIndex == 1) {
                        indexOfMidPointOfArray--;
                    }
                    rightBoundIndex = indexOfMidPointOfArray;
                }
                if (array[indexOfMidPointOfArray] == searchKey) {
                    return indexOfMidPointOfArray;
                } else if (indexOfMidPointOfArray == 0 || indexOfMidPointOfArray == array.length - 1) {
                    return -1;
                }
            }
            while (searchKey != array[indexOfMidPointOfArray]);
        }
        else {
            return -1;
        }
        return -1;
    }

    public static int getIndexOfMidpoint(int leftBound, int rightBound) {
        return (leftBound + rightBound) / 2;
    }
}
