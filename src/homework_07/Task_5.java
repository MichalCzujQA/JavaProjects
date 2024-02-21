package homework_07;

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {

        int count = 4;
/*
        while (count < 5){
            System.out.println("Body Cycle while loop");
            count++;
        }



        count = 4;

        do {
            System.out.println("Body Cycle do while");
            count++;
        }while (count < 5);

 */
        //option_01

        Scanner scanner = new Scanner(System.in);

        System.out.println("Write hello");
        String hello = scanner.nextLine();

        while (!hello.equalsIgnoreCase("hello")) {
            System.out.println("Write hello");
            hello = scanner.nextLine();
        }
        System.out.println("Thank you!");

        //option_02
        String helloDo;
        do {
            System.out.println("Write hello");
            helloDo = scanner.nextLine();
        } while (!helloDo.equalsIgnoreCase("hello"));
        System.out.println("Thank you!");


    }
}
