package homework_18;

public class JumpingDog {
    public static void main(String[] args) {
        Dog dog = new Dog("Jumper", 50);
        dog.info();
        dog.setName("Jack");

        System.out.println(dog.takeBarrier(30));
        System.out.println("========================\n");
        System.out.println(dog.takeBarrier(70));
        System.out.println(dog.takeBarrier(120));

        System.out.println("\n===================");
        Dog dog1 = new Dog("Bim", 44);

        System.out.println(dog1.takeBarrier(85));


    }
}
