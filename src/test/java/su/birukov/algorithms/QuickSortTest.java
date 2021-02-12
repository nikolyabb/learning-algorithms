package su.birukov.algorithms;

import org.junit.Test;

import static org.junit.Assert.*;
import main.java.su.birukov.algorithms.QuickSort;

public class QuickSortTest {
    @Test
    public void testStandartSorting () {
        int[] seq = {55, 14, 92, 32, 76, 11, 8, 0, 91, 67, 85, 55};
        int[] expectedResult = {92, 91, 85, 76, 67, 55, 55, 32, 14, 11, 8, 0};

        int[] sortedArray = QuickSort.qsort(seq);

        assertEquals("Expect both arrays has the same lenght", sortedArray.length, seq.length);

        for (int i = 0; i < sortedArray.length; i++) {
            //System.out.print(sortedArray[i] + ",");
            assertEquals("Expect that sorting performed as expexted", sortedArray[i], expectedResult[i]);
        }


    }
}
