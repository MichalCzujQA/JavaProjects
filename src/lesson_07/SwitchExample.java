package lesson_07;

import java.util.Random;

public class SwitchExample {
    public static void main(String[] args) {

        int x = 7;

        if (x == 5) {
            System.out.println("if block x = 5");
        } else if (x == 7) {
            System.out.println("if x == 7");
        } else {
            System.out.println("else x  == smthg another");
        }

        //String name = "Fred";
        switch (x) {
            case 5:
                System.out.println("switch x == 5");
                break;
            case 7:
                System.out.println("switch x == 7");
                break;
            default:
                System.out.println("switch x  == smthg another");


        }


        Random random = new Random();
        int note = random.nextInt(5) + 1;
       int money = 100;

        System.out.println("You have: " + note + " points");

        switch (note) {
            case 5:
                System.out.println("You get + 20");
                money +=20;

                break;
            case 4:
                System.out.println("You get + 10");
                money +=10;
                break;
            case 3:
                System.out.println("You didnt get");
                money +=0;
                break;
            case 2:
                System.out.println("Sorry - 20");
                money -=20;
                break;
            case 1:
                System.out.println("Sorry - 100");
                money = 0;

            default:
                System.out.println("Wrong point");

        }
        System.out.println("You have money: " + money + "$");


    }
}
