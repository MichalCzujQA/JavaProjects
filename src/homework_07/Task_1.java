package homework_07;

/*
Task 1 (Использовать оператор switch)

Программа просит пользователя ввести число от 1 до 7 Если число равно 1,
 выводим на консоль “Понедельник”, 2 –”Вторник” и так далее. Если 6 или 7 – “Выходной”.
 */

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write number of 1 to 7");
        int userInputDay = scanner.nextInt();


        switch (userInputDay){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Thursday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("ERROR");
        }


    }
}
