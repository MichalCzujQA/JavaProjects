package lesson_27;

import util.MyList;

public class GenericMethods {

    // Ограничиваем диапазон принимаемых типов данных
    // Ограничение сверху
    public static <T extends Number> int sum(T... elements) {
        int sum = 0;
        for (T value : elements) {
            sum += value.intValue();
        }
        return sum;
    }

    //? - Wild Card - Любой тип данных являющиеся наследником Number
    public static Double printListSum(MyList<? extends Number> listNumber) {
        double sum = 0;
        for (int i = 0; i < listNumber.size(); i++) {
            sum += listNumber.get(i).doubleValue();
        }
        System.out.println("Sum of Elements: " + sum);
        return sum;
    }
}
