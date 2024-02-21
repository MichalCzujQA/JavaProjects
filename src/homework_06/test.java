package homework_06;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Option 1

        System.out.println("Input number");
        String number = scanner.nextLine();
        System.out.println(number);

        if (number.length() == 4) {

            char ch0 = number.charAt(0);
            if (ch0 < 48 || ch0 > 57) {
                System.out.println("this is not number: ");
                System.exit(0);
            }

            int leftSum = number.charAt(0) + number.charAt(1);
            int rightSum = number.charAt(2) + number.charAt(3);
            System.out.println("leftSum: " + leftSum);
            System.out.println("rightSum: " + rightSum);

            if (leftSum == rightSum) {
                System.out.println("Yoohoo, number is happy");
            } else {
                System.out.println("Wrong number, is Sad!!!");
            }
        } else {
            System.out.println("Your wrote wrong numbers");
        }

        //Option 2
        if (number.length() == 4) {
            int digit = Integer.parseInt(number);
            System.out.println("We have the number from list! " + digit);

            //1234
            int digit0 = digit % 10;
            digit = digit / 10; // -> 123

            //123
            int digit1 = digit % 10;
            digit /= 10;

            //12
            int digit2 = digit % 10;

            int digit3 = digit / 10;


            System.out.println(digit0 + " | " + digit1 + " | " + digit2 + " | " + digit3);

            if (digit0 * digit1 == digit2 + digit3){
                System.out.println("Yoohoo, number is happy");
            } else {
                System.out.println("Wrong number, is Sad!!!");
            }



        } else {
            System.out.println("Your wrote wrong numbers");
        }




    }
}
