package homework_07;

/*
Task 0

Перепишите решение задачи с использованием switch вместо if-else:

Необходимо написать программу, где бы пользователю предлагалось ввести число на выбор: 1, 2 или 3,
а программа должна сказать, какое число ввёл пользователь: 1, 2, или 3
 */

import java.util.Scanner;

public class Task_0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write number from 1,2,3");

        int input = scanner.nextInt();


        switch (input){
            case 1:
                System.out.println("You wrote  1");
                break;
            case 2:
                System.out.println("You wrote 2");
                break;
            case 3:
                System.out.println("You wrote 3");
                break;
            default:
                System.out.println("Wrong number");
        }

    }
}
