package homework_35;

import java.util.Arrays;
import java.util.Comparator;

/*
Напишите MyComparator2 с методом сравнения для сортировки массива целых чисел в следующем порядке:

Четные целые числа должны идти перед нечетными числами в порядке возрастания.
Нечетные целые числа должны идти после четных в порядке убывания

Integer[] integers = { 1, 6, 5, 4, 7, 8, 9, 2, 7, 3 };
[2, 4, 6, 8, 9, 7, 7, 5, 3, 1] // Outpur
 */
public class MyComparator2 {

    public Integer[] sort(Integer[] integers) {
        Arrays.sort(integers, Comparator.comparingInt((Integer a) -> a % 2 == 0 ? 0 : 1)
                .thenComparingInt((Integer a) -> a % 2 == 0 ? a : -a));
        return integers;
    }
    public static void main(String[] args) {
        MyComparator2 comparator = new MyComparator2();
        Integer[] integers = { 1, 6, 5, 4, 7, 8, 9, 2, 7, 3 };
        Integer[] sortedIntegers = comparator.sort(integers);
        System.out.println("Sorted integers: " + Arrays.toString(sortedIntegers));

    }


}
