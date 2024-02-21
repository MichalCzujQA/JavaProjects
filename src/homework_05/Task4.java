package homework_05;

import java.util.Random;

/*
Создайте переменную типа int.
Инициализируйте переменную произвольным значением
Выведите строку в формате:
Число: 6 четное: true; кратно 3: true; четное и кратное 3: true
Число: 3 четное: false, кратно 3: true, четное и кратное 3: false
 */
public class Task4 {
    public static void main(String[] args) {
        Random random = new Random();

        int rand = random.nextInt(11);
        rand = 0;

        boolean isEven = (rand != 0) & (rand % 2 == 0);
        boolean isDevByThree = rand != 0&  rand % 3 == 0;
        boolean isTwice = isEven & isDevByThree;

        System.out.println("isEven " + isEven);
        System.out.println("isDevByThree " + isDevByThree);
        System.out.println("isTwice " + isTwice);

        System.out.printf(" ", rand, isEven, isTwice, isDevByThree);

    }
}
