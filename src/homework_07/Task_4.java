package homework_07;

public class Task_4 {
    public static void main(String[] args) {

        int i = 1;

        int countNumber = 0;

        while (i <= 100 && countNumber < 7){
            System.out.println("Number: " + i);

            if (i % 5 == 0){
                System.out.println("i % 5 = " + i);
                countNumber++;
                i +=5;
            } else {
                i++;
            }


        //    System.out.println(i);

        }





    }
}
