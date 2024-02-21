package lesson_26;

import util.MyArrayList;
import util.MyList;

import java.util.Arrays;
import java.util.Objects;

public class ArrayListApp {
    public static void main(String[] args) {
        MyArrayList<Integer> integerList = new MyArrayList<>();

        MyList<String> stringList = new MyArrayList<>();

        MyList<Number> numberList = new MyArrayList<>();

        integerList.add(100);
        System.out.println(integerList);
        integerList.addAll(200, 300, 400, 500, 20, 30, 40, 99);
        System.out.println(integerList);
        System.out.println("Size: " + integerList.size());

        Integer value = integerList.get(5);

        System.out.println(value);

        integerList.set(5, -500);
        System.out.println(integerList);

        System.out.println("integerList.indexOf(1000): " + integerList.indexOf(1000));
        System.out.println("integerList.indexOf(1000): " + integerList.indexOf(500));

        integerList.add(500);
        System.out.println(integerList);
        System.out.println("integerList.lastIndexOf(500): " + integerList.lastIndexOf(500));

        stringList.addAll("Hello", "Java", "Python", "Some String", "Orange");
        System.out.println(stringList);

        System.out.println(" stringList.contains(hello): " + stringList.contains("hello"));
        System.out.println(" stringList.contains(Hello): " + stringList.contains("Hello"));

        integerList.addAll(1, 2, 3, 4, 5, 6, 7);
        System.out.println(integerList);


        System.out.println("\n===============================\n");
        // удалить по значению
        System.out.println(integerList.remove(Integer.valueOf(30)));

        System.out.println(integerList);

        //удалить по индексу
        System.out.println(integerList.remove(1));
        System.out.println(integerList);

        System.out.println("numberList.isEmpty(): " + numberList.isEmpty());
        System.out.println("stringList.isEmpty: " + stringList.isEmpty());

        numberList.addAll(15, 5.6, -10000, 0, 5.7, 5.7F);
        System.out.println(numberList);

        Integer[] array = integerList.toArray(); // dont work. need rep..
        System.out.println(Arrays.toString(array));
        System.out.println((array.length));

    }
}
