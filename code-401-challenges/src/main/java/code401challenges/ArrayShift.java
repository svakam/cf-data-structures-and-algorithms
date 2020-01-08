package code401challenges;

public class ArrayShift {
    public static int[] insertShiftArray(int[] arrayToPullFrom, int numberToAdd) {
        // new array length is 1 longer than old array
        int newArrLength = arrayToPullFrom.length + 1;

        // initialize new array with new length
        int[] arrayToAddTo = new int[newArrLength];

        // set midpoint of new array equal with respect to length of old array
        int midpointOfNewArr = newArrLength / 2;
        System.out.println("Midpoint: " + midpointOfNewArr);

        // iterate through new array and insert old array values and number to add
        for (int i = 0; i < newArrLength; i++) {
            if (i < midpointOfNewArr) {
                arrayToAddTo[i] = arrayToPullFrom[i];
            } else if (i == midpointOfNewArr) {
                arrayToAddTo[i] = numberToAdd;
            } else {
                arrayToAddTo[i] = arrayToPullFrom[i - 1];
            }
        }
        return arrayToAddTo;
    }
}
