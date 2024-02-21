package homework_09;

import java.util.Scanner;

public class HW09_Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int percentPerMonth = 7;

        float sumDeposit;
        int month;

        System.out.println("How much do u wanna pay in BankAccount?");
        sumDeposit = scanner.nextFloat();

        System.out.println("How long in month do you want?");
        month = scanner.nextInt();

        for (int i = 1; i <= month; i++) {
            sumDeposit += sumDeposit * percentPerMonth / 100;

        }
        System.out.printf("%d maybe we will give you back %.2f", month, sumDeposit);

    }
}
