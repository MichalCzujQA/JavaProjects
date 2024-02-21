package lesson_10;

public class BreakContinue {
    public static void main(String[] args) {

        for (int i = 1; i < 11; i++) {
            System.out.println("before if: " + i);

            if (i == 4) continue;


            System.out.println("after if: " + i);

            if (i == 8) break;
            System.out.println("after break: " + i);
            // System.out.println(i);
        }

        for (int i = 1; i < 21; i++) {
            if (i % 2 != 0) continue;
            System.out.println(i);


        }
    }
}

