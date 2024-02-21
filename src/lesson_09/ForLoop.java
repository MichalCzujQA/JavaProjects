package lesson_09;

import java.util.Random;

public class ForLoop {
    public static void main(String[] args) {


        for (int i = 0; i < 10; i++) {
            System.out.print(i);
        }
        System.out.println();

        //while loop
/*
        int k = 0;
        while (k < 10) {
            k++;
        }

 */
        System.out.println("=======================");

        /*
        for (; ; ){
            System.out.println("Hello ");
        }

         */

        int j = 15;
        for (j = 0; j < 20; j++) {
            System.out.print(j);
        }

        for (int i = j - 5; i < 20; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i >= 0; i += 10000) {
            System.out.println(i);
        }

        for (String str = "Hello"; str.length() < 10; str += "$") {
            System.out.println(str);
        }

        int k1 = 0;
        k1 = 15;

        for (int a = 0, f = 1; k1 >= 0 && f < 10; k1--, a = ++a + k1, f++) {
            System.out.println(k1 + " :  " + a + " : " + f);
        }


        Random random = new Random();

        int[] ints = new int[random.nextInt(11)];
        System.out.println("size: " + ints.length);

        System.out.print("[");

        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt(101) - 50;
            System.out.print(ints[i] + ((i < ints.length - 1) ? ", " : "]\n"));

        }


    }
}
