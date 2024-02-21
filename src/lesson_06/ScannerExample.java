package lesson_06;

import java.util.Locale;
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        scanner.useLocale(Locale.GERMANY);

        System.out.println("Write your name: ");
        String name = scanner.nextLine();

        scanner.nextLine();

        System.out.println("Your name is: " + name);

        System.out.println("Write your age!");
        int age = scanner.nextInt();
        System.out.println("Your age is: " + age);

        System.out.println("Write double");
        double dbl = scanner.nextDouble();
        System.out.println(dbl);

    }
}
