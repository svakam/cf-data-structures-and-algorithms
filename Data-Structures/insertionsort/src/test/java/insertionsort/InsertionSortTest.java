package insertionsort;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class InsertionSortTest {
    // test instantiation
    @Test
    public void testInstantiate() {
        InsertionSort insertionSort = new InsertionSort();
    }

    InsertionSort insertionSort;

    @Before
    public void setUp() {
        insertionSort = new InsertionSort();
    }

    // test happy insertion
    @Test
    public void testInsertionHappy() {
        int[] happyArr = {8,4,23,42,16,15};
        int[] expected = {4,8,15,16,23,42};
        int[] actual = insertionSort.insertion(happyArr);
        assertArrayEquals(expected, actual);
    }

    // test reversed array
    @Test
    public void testInsertionReverse() {
        int[] reverseArr = {20,18,12,8,5,-2};
        int[] expected = {-2,5,8,12,18,20};
        int[] actual = insertionSort.insertion(reverseArr);
        assertArrayEquals(expected, actual);
    }

    // test nonunique values
    @Test
    public void testInsertionUniques() {
        int[] uniquesArr = {5,12,7,5,5,7};
        int[] expected = {5,5,5,7,7,12};
        int[] actual = insertionSort.insertion(uniquesArr);
        assertArrayEquals(expected, actual);
    }

    // test nearly sorted array
    @Test
    public void nearlySortedArr() {
        int[] nearlySortedArr = {2,3,5,7,13,11};
        int[] expected = {2,3,5,7,11,13};
        int[] actual = insertionSort.insertion(nearlySortedArr);
        assertArrayEquals(expected, actual);
    }
}
