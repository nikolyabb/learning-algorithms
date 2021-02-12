package su.birukov.algorithms;

import org.junit.Test;

import java.lang.reflect.Array;
import static org.junit.Assert.*;

public class StandartSortingTest {
    @Test
    public void testStandartSorting () {
        int[] seq = {55, 14, 92, 32, 76, 11, 8, 0, 91, 67, 85, 55};
        int[] expectedResult = {92, 91, 85, 76, 67, 55, 55, 32, 14, 11, 8, 0};

        StandartSorting initialArray = new StandartSorting(seq);

        int[] sortedArray = initialArray.sort();


        for (int i = 0; i <sortedArray.length ; i++) {
            //System.out.print(sortedArray[i] + ",");
            assertEquals("Expect that sorting performed as expexted", sortedArray[i], expectedResult[i]);
        }


    }
}
