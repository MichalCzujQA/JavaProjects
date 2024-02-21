package homework_06;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {


        Random random = new Random();

        int var = random.nextInt(101);
        int var1 = random.nextInt(101);
        int var2 = random.nextInt(101);
        int var3 = random.nextInt(101);

        System.out.println(var + " | " + var1 + " | " + var2 + " | " + var3);

        int max = var;
        if (max < var1) {
            max = var1;
        }
        if (max < var2) {
            max = var2;
        }
        if (max < var3) {
            max = var3;
        }
        System.out.println("Max: "+  max);

    }
}
