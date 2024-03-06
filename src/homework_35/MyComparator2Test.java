package homework_35;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyComparator2Test {
    @Test
    public void testSort() {
        MyComparator2 comparator = new MyComparator2();
        Integer[] integers = { 1, 6, 5, 4, 7, 8, 9, 2, 7, 3 };
        Integer[] expected = { 2, 4, 6, 8, 9, 7, 7, 5, 3, 1 };

        Integer[] result = comparator.sort(integers);
        assertArrayEquals(expected, result);
    }

}