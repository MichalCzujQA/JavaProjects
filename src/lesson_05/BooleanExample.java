package lesson_05;

public class BooleanExample {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;

        boolean bol1;
        bol1 = true;
        bol1 = false;

        bol1 = x == y;
        System.out.println(bol1);

        bol1 = x == 10;
        System.out.println(bol1);

        boolean bol2 = x != y;
        System.out.println("bol2 " + bol2);

        bol2 = x != 10;
        System.out.println(bol2);

        boolean bol3 = x > y;
        System.out.println(bol3);

        bol3 = x > 10;
        System.out.println(bol3);

        boolean bol4 = x >= y;
        System.out.println(bol4);
        bol4 = x >= 10;
        System.out.println(bol4);

        boolean bol5 = x < y;

        bol5 = x <= 10;
        System.out.println(bol5);

        boolean bol6 = true;
        System.out.println("True: " + bol6);

        bol6 = !true;
        System.out.println("!True: " + bol6);

        System.out.println("!false: " + !false);

        System.out.println("!4 == 5 -> " + !(4 == 5));

        boolean bol7 = (2 < 5) & (11 == 10);
        System.out.println("(2 < 5) & (11 == 10) " + bol7);

        bol7 = (2 < 5) & (11 != 10);
        System.out.println("(2 < 5) & (11 == 10) " + bol7);

        boolean bol8 = (2 < 5) | (11 == 10);
        System.out.println("(2 < 5) | (11 == 10): " + bol8);

        bol8 = (2 > 5) | (11 == 10);
        System.out.println(bol8);
    }
}
