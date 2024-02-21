package lesson_16;

public class MainDOgs {
    public static void main(String[] args) {

        Dog dog = new Dog("Boss", 7);

        System.out.println(dog.whoAmI());
        dog.run();
        dog.run();
        dog.run();
        dog.run();


        System.out.println("================");
        System.out.println(dog.whoAmI());



/*
        dog.eat();
        dog.eat();
        dog.eat();
        System.out.println(dog.whoAmI());

 */


    }
}
