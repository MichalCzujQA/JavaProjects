package lesson_16;

public class Main16 {
    public static void main(String[] args) {


        Cat cat = new Cat("Max");

        Cat cat1 = new Cat("Bear", "black");
        cat1.whoAmI();

        Cat cat2 = new Cat("Freddy", "white", 5);

        cat2.whoAmI();

    }
}
