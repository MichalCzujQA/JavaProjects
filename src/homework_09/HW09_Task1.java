package homework_09;

import java.util.Random;

public class HW09_Task1 {
    public static void main(String[] args) {
        Random random = new Random();

        int sum = 0;
        int countNumber = 0;

        int[] randomInts = new int[20];

        System.out.println("[");
        for (int i = 0; i < randomInts.length; i++) {
            randomInts[i] = random.nextInt(11);
            int currentNumber = randomInts[i];
            System.out.print(currentNumber + ((i < randomInts.length -1) ? "; " : "]"));
            if (countNumber % 2 == 0) {
                countNumber++;
                sum += randomInts[i];
            }
        }
        System.out.println(countNumber);
        System.out.println(sum);



    }
}
