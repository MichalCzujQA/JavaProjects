package homework_06;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Write number 1, 2 or 3");
        int input = scanner.nextInt();

        if (input == 1) {
            System.out.println("You wrote 1");
        } else if (input == 2) {
            System.out.println("You wrote number 2");
        } else if (input == 3){
            System.out.println("You wrote number 3");
        }else {
            System.err.println("Wrong number");
        }
        scanner.close();


    }
}
