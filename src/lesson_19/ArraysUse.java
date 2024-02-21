package lesson_19;

import lesson_18.Car;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class ArraysUse {
    public static void main(String[] args) {


        // Class Arrays
        int[] ints = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};


        String stringArray = Arrays.toString(ints);
        System.out.println(stringArray);

        System.out.println(Arrays.toString(ints));

        //Option 2 copyOf()
        int[] newInts = Arrays.copyOf(ints, 9);
        System.out.println(Arrays.toString(newInts));

        int[] intsRange = Arrays.copyOfRange(ints, 2, 7);
        System.out.println("intsRange: " + Arrays.toString(intsRange));

        int[] fillArray = new int[10];
        Random random = new Random();
        Arrays.fill(fillArray, random.nextInt(101));
        System.out.println(Arrays.toString(fillArray));

        int[] number = {1, 2, 3, 4};
        int[] digits = {1, 2, 3, 4};
        
        System.out.println(number == digits);

        System.out.println(number.equals(digits));


        System.out.println(Arrays.equals(number,digits));


    }
}
