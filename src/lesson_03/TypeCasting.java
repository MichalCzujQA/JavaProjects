package lesson_03;

public class TypeCasting {
    public static void main(String[] args) {


        byte byteValue = 123;
        int intValue;

        intValue = byteValue;

        System.out.println(intValue);

        double doubleValue;
        doubleValue = intValue;

        System.out.println(doubleValue);

        doubleValue = 125.65;
        intValue = (int) doubleValue;

        System.out.println(intValue);
        System.out.println("----------------------------");


        int x = 20;
        int y = 7;

        double result;

        result = (double) x / y;

        System.out.println(result);

    }
}
