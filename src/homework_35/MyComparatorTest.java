package homework_35;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyComparatorTest {
    @Test
    public void testSort() {
        MyComparator comparator = new MyComparator();
        Integer[] integers = { 1, 6, 5, 4, 7, 8, 9, 2, 7, 3 };
        Integer[] expected = { 2, 4, 6, 8, 1, 3, 5, 7, 7, 9 };

        Integer[] result = comparator.sort(integers);
        assertArrayEquals(expected, result);
    }
}