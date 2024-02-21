package lesson_16;

public class Dog {
    String name;
    int weight;

    public Dog(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    void eat() {
        System.out.println("I eating something...");
        weight++;
    }

    void run() {
        while (weight < 3){
            System.out.println("I cant run anymore, i wanna EAT!!! ");
            System.out.println("My weight: " + weight + " need to eat");
            eat();
        }

            System.out.println("I running .....");
        weight -= 2;

    }

    String whoAmI() {
        return "I am dog: " + this.name + " my weight: " + weight;
    }


}
