package lesson_18;

public class Lesson18 {
    public static void main(String[] args) {
        int sum = MathUtils.sumOfInts(1, 4, 5, 6);
        System.out.println("Sum = " + sum);

        System.out.println(MathUtils.minus(10,45));

        Car car = new Car("Test", 100);
        Car car2 = new Car("Car", 200);

        car.info();
        System.out.println(Car.getCountCar());

    }
}
