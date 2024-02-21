package lesson_16;

public class Cat {


    String name;
    String color;
    int age;


    //this is constructor
    public Cat() {

    }

    //this is not constructor, it's a method
    public void Cat() {

        System.out.println("Method CAT");
    }

    public Cat(String catName) {
        System.out.println("Constructor 2");
        name = catName;
    }

    public Cat(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Cat(String name, String color, int age) {
        this(name, color);
        this.age = age;

    }


    public void whoAmI() {
        System.out.println("Im cat " + name + " i have been age: " +
                age + " years old" + " color " + color);
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
