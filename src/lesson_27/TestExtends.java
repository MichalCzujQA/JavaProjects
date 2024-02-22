package lesson_27;

import lesson_27.generics.GenericMethods;
import util.MyArrayList;
import util.MyList;

public class TestExtends {


    public static void main(String[] args) {

        //строгая типизация на стадии компиляции - ошибка
        System.out.println(GenericMethods.sum(Long.valueOf(1500)));

        System.out.println(GenericMethods.sum(Double.valueOf(5.76), 5.43, 6, 8.43));

        //
        MyList<? super Integer> list = new MyArrayList<Number>();


        list.add(123);
        Integer integer = (Integer) list.get(0);
        System.out.println(integer);

        MyList<Integer> integerList = new MyArrayList<>();
        integerList.addAll(100, 34, 54);

        MyList<String> stringList = new MyArrayList<>();
        stringList.addAll("String", "hello");

        double result = GenericMethods.printListSum(integerList);
        System.out.println(result);


    }
}
