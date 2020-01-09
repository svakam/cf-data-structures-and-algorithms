package code401challenges;

import org.junit.Test;
import static org.junit.Assert.*;

public class BinarySearchTest {
    int notInArrayReturn = -1;
    int integerOutBounds = 99;
    int[] array1 = {1, 2, 3, 4, 5, 6};
    int[] array2 = {2,4,6,8,10};
    int integer1 = 3;

    @Test public void testEvenArray() {
        // test even length array
        int expected1 = 2;
        assertTrue(expected1 == BinarySearch.findIntegerInArray(array1, integer1));
    }

    @Test public void testOddArray() {
        // test odd length array
        int integer2 = 6;
        int expected2 = 2;
        assertTrue(expected2 == BinarySearch.findIntegerInArray(array2, integer2));
    }

    @Test public void testOutBounds() {
        // test even array with out of bounds input
        assertTrue(notInArrayReturn == BinarySearch.findIntegerInArray(array1, integerOutBounds));

        // test odd array with out of bounds input
        assertTrue(notInArrayReturn == BinarySearch.findIntegerInArray(array2, integerOutBounds));
    }

    @Test public void testEmpty() {
        // test empty array
        int[] array3 = {};
        assertTrue(notInArrayReturn == BinarySearch.findIntegerInArray(array3, integer1));
    }

    @Test public void testRightHalf() {
        // test integer being on right half
        int integerRightHalf = 6;
        int expectedRightHalfIndex = 5;
        assertTrue(expectedRightHalfIndex == BinarySearch.findIntegerInArray(array1, integerRightHalf));
    }

    @Test public void testLeftHalf() {
        // test integer being on left half
        int integerLeftHalf = 1;
        int expectedLeftHalfIndex = 0;
        assertTrue(expectedLeftHalfIndex == BinarySearch.findIntegerInArray(array1, integerLeftHalf));
    }
}
