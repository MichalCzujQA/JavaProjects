package lesson_15;

public class Cat {


    String name;
    String color;
    int age;


    public Cat() {
        System.out.println("Constructor 1");
    }

    public Cat(String catName) {
        System.out.println("Constructor 2");
        name = catName;
    }


    public void whoAmI() {
        System.out.println("Im cat " + name + " i have been age: " +
                age + " color " + color);
    }


    void sleep() {
        System.out.println("Im sleeping");
    }

    void sayMeow() {
        System.out.println("Meow!!!");
    }

    void run() {
        System.out.println("Run!!!");
    }


}
