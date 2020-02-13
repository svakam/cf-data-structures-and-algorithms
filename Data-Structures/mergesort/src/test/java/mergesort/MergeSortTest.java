package mergesort;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class MergeSortTest {
    @Test
    public void testInstantiate() {
        MergeSort mergeSorter = new MergeSort();
        System.out.println("mergeSorter = " + mergeSorter);
    }

    MergeSort mergeSorter;

    @Before
    public void setUp() {
        mergeSorter = new MergeSort();
    }

    @Test
    public void testHappy() {
        int[] happyArr = {8,4,23,42,16,15};
        int[] expected = {4,8,15,16,23,42};
        mergeSorter.mergeSort(happyArr);
        assertArrayEquals(expected, happyArr);
    }

    @Test
    public void testReverse() {
        int[] reverseArr = {20,18,12,8,5,-2};
        int[] expected = {-2,5,8,12,18,20};
        mergeSorter.mergeSort(reverseArr);
        assertArrayEquals(expected, reverseArr);
    }

    @Test
    public void testUniques() {
        int[] uniquesArr = {5,12,7,5,5,7};
        int[] expected = {5,5,5,7,7,12};
        mergeSorter.mergeSort(uniquesArr);
        assertArrayEquals(expected, uniquesArr);
    }

    @Test
    public void nearlySorted() {
        int[] nearlySortedArr = {2,3,5,7,13,11};
        int[] expected = {2,3,5,7,11,13};
        mergeSorter.mergeSort(nearlySortedArr);
        assertArrayEquals(expected, nearlySortedArr);
    }

    // fail case, empty array
    @Test (expected = ArrayIndexOutOfBoundsException.class)
    public void testNullArr() {
        int[] nullArr = {};
        mergeSorter.mergeSort(nullArr);
        assertEquals("Array is empty", nullArr);
    }
}
