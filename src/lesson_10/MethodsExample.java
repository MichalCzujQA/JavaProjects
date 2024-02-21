package lesson_10;

public class MethodsExample {
    public static void main(String[] args) {

        sayHello();

        char ch = 'A';
        char ch1 = 'G';
        char ch2 = 't';

        printDecimalCode('V');
        printDecimalCode(ch);
        printDecimalCode(ch1);

        int[] array = {1, 45, 76, 37, 90, 5432, 397, 0, 45};


        array[4] = 4565;
        array[7] = array[4] * 10;


        printArray(array);


        int var = 10;
        changeVar(var);

        System.out.println("Var from main: " + var);

        System.out.println("=============================");
        printArray(array);
        changeArrayElement(array);

        System.out.println("Number[0] from method " + array[0]);



    }

    public static void changeArrayElement(int[] numbers) {
        numbers[0] = 1000;
        System.out.println("Number[0] from method " + numbers[0]);
        numbers = new int[4];
        numbers[0] = 2000;
        System.out.println(numbers[0]);
    }

    public static void changeVar(int number) {
        number = number + 15;
        System.out.println("Number from Method: " + number);
    }

    public static void printArray(int[] array) {


        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + ((i < array.length - 1) ? ", " : "."));

        }


    }

    public static void printDecimalCode(char ch1) {
        System.out.println("Method: " + ch1);
        System.out.println((int) ch1);

    }

    public static void sayHello() {
        int x = 5;
        int y = 10;
        int z = x + y;
        System.out.println("hello");
        System.out.println(z);

    }
}
