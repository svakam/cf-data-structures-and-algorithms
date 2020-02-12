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
        int[] actual = mergeSorter.mergeSort(happyArr);
        assertArrayEquals(expected, actual);
    }
}
