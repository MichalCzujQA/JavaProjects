package lesson_15;

public class CatsMain {


    public static void main(String[] args) {
        Cat cat = new Cat();

        cat.sayMeow();
        cat.run();
        cat.sleep();

        String catName = cat.name;

        System.out.println("Cat name: " + catName);
        System.out.println("Cat age: " + cat.age);
        System.out.println("Color: " + cat.color);

        System.out.println("===================================");

        Cat cat1 = new Cat("Max");
        cat1.sayMeow();
        cat1.run();
        cat1.sleep();


        System.out.println("Cat name: " + cat1);
        System.out.println("Cat age: " + cat1.age);
        System.out.println("Color: " + cat1.color);

        System.out.println("=======================");

        cat.whoAmI();
        cat1.whoAmI();




    }
}

