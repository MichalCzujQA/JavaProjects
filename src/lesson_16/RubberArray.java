package lesson_16;

import java.util.ArrayList;

public class RubberArray {
    int[] array;

    int cursor;

    public RubberArray() {
        array = new int[10];

    }

    void add(int number) {

        if (cursor > array.length * 0.9) {
            expandArray();
        }
        array[cursor] = number;
        cursor++;
    }

    void add(int... ints) {
        for (int i = 0; i < ints.length; i++) {
            add(ints[i]);
        }
    }


    void expandArray() {

        int[] newArray = new int[array.length * 2];
        for (int i = 0; i < cursor; i++) {
            newArray[i] = array[i];

        }


        array = newArray;
    }

    public String toString() {
        if (cursor == 0) return "[]";

        String result = "[";
        for (int i = 0; i < cursor; i++) {
            result += array[i] + ((i < cursor - 1) ? ", " : "]");
        }
        return result;
    }

}

