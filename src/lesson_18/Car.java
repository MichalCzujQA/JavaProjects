package lesson_18;

public class Car {

   private static int countCar;

    private String model;
    private int powerPS;

    public Car(String model, int powerPS) {
        this.model = model;
        this.powerPS = powerPS;
        countCar++;
    }

    public Car(String model) {
        this.model = model;
        countCar = 100;
    }

    public void info() {
        System.out.println("Car: " + this.model + " | power = " + powerPS + " | count: " + countCar);
    }

    public static  int getCountCar(){
        return countCar;
    }


    public static void main(String[] args) {

        Car car = new Car("BMW", 200);
        car.info();
        Car car1 = new Car("VW", 300);
        car1.info();
        Car car2 = new Car("Ford", 75);
        car2.info();

        System.out.println("Made all time cars: " + Car.countCar);

        Car car3 = new Car("Model");
        car3.info();


        System.out.println("Made all time cars: " + Car.countCar);


    }


}
