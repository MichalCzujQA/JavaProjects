package lesson_06;

public class ifStatement {
    public static void main(String[] args) {

        int x = 10;

        {
            int y = 5;
            x = x + y;
        }

        System.out.println("x " + x);

      int number = 9;


        if (number > 10){
            System.out.println("Hello ");
            System.out.println("Now X > 10");
        }else {
            System.out.println("I leaved ");
            System.out.println("Now x < 10");
        }



    }
}
