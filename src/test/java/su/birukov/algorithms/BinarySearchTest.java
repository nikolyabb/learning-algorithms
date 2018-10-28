package su.birukov.algorithms;

import org.junit.Test;
import static org.junit.Assert.*;
import su.birukov.algorithms.BinarySearch;

public class BinarySearchTest {
    @Test
    public void testBinarySearch() {
        int[] sequence = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        BinarySearch list = new BinarySearch(sequence);

//        System.out.println(list.search(1));
//        System.out.println(list.search(10));
//        System.out.println(list.search(12));

        assertEquals("Expect number 1 at 0 index", list.search(1), (Object) 0);
        assertEquals("Expect number 10 at 9 index", list.search(10), (Object) 9);
        assertNull("Expect number 12 does not present", list.search(12));

    }
}