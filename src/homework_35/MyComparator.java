package homework_35;

import java.util.Arrays;
import java.util.Comparator;

/*
Напишите MyComparator, реализующий Comparator с методом сравнения для сортировки массива целых чисел в следующем порядке:
Четные целые числа должны идти перед нечетными числами
Integer[] integers = { 1, 6, 5, 4, 7, 8, 9, 2, 7, 3 };
[2, 4, 6, 8, 1, 3, 5, 7, 7, 9] // Outpur
 */
public class MyComparator {
    public Integer[] sort(Integer[] integers) {
        Arrays.sort(integers, Comparator.comparingInt(x -> ((Integer)x) % 2 == 0 ? 0 : 1).thenComparingInt(x -> (Integer)x));
        return integers;
    }

    public static void main(String[] args) {
        Integer[] ints = { 1, 6, 5, 4, 7, 8, 9, 2, 7, 3 };

        MyComparator comparator = new MyComparator();
        Integer[] sortedInts = comparator.sort(ints);

        System.out.println(Arrays.toString(sortedInts));
    }


}
