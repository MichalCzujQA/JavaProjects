package lesson_08;

import java.util.ArrayList;
import java.util.Random;

public class ArraysExample {

    public static void main(String[] args) {

        int[] array;

        // int numbers[];

        array = new int[5];

        String[] strings = new String[7];

        int[] digits = new int[]{
                56, -98, 14, 1004, 1443
        };
        String[] str = {"Str", "hello", "Java", "JS", "Orange"};

        int num = 15;

        int value = digits[0];
        System.out.println(value);

        System.out.println(str[2]);

        System.out.println((digits[3] / 2 - 15));

        System.out.println(digits);

        int length = digits.length;
        int i = 0;
        while (i < length) {
            System.out.println(digits[i] + ", ");
            i++;
        }
        System.out.println();

        digits[2] = 5000;
        i = 0;
        while (i < digits.length) {
            System.out.println(digits[i] + ", ");
            i++;
        }
        System.out.println();


        System.out.println(array[2]);
        System.out.println(strings[5]);
        strings[5] = "Pascal";

        System.out.println(strings[5]);

        Random random = new Random();

        int[] num1 = new int[10];
        int nun = 0;
        System.out.print("[");
        while (nun < num1.length) {
            num1[nun] = random.nextInt(101);
            System.out.print(num1[nun] + ", ");
            nun++;
        }
        System.out.println("]");

        nun = 1;
        int min = num1[0];
        while (nun < num1.length){
            if (  num1[nun]<min){
                min = num1[nun];
            }
            nun++;
        }
        System.out.println("Min " + min);

    }
}
