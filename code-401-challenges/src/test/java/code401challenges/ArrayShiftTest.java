package code401challenges;

import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayShiftTest {
    // test even length array
    @Test public void testEvenArrayShift() {
        int[] newArray = {1,2,3,4,5};
        int[] oldArray = {1,2,4,5};
        int numberAdd = 3;
        assertArrayEquals(newArray, ArrayShift.insertShiftArray(oldArray, numberAdd));
    }

    // test odd length array
    @Test public void testOddArrayShift() {
        int[] newArray2 = {1,3,4,5};
        int[] oldArray2 = {1,3,5};
        int numberAdd = 4;
        assertArrayEquals(newArray2, ArrayShift.insertShiftArray(oldArray2, numberAdd));
    }

    // test no length array
    @Test public void testNoLengthArrayShift() {
        int[] newArray3 = {10};
        int[] oldArray3 = {};
        int numberAdd = 10;
        assertArrayEquals(newArray3, ArrayShift.insertShiftArray(oldArray3, numberAdd));
    }
}
