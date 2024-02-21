package lesson_20;

public class SpecialBus extends Bus {

    private int bicyclePlaces;
    private int bicyclesCount; // по дефолту инициализируется 0


    public SpecialBus(String model, int yearManufactured, int capacity, int bicyclePlaces) {
        super(model, yearManufactured, capacity);
        this.bicyclePlaces = bicyclePlaces;
    }

    public boolean takePassengerWithBicycle() {
        // Есть ли место для
        // 1. Пассажира
        // 2. Велосипеда.
        // если место для обоих - обоих на борт
        // если для кого-то нет места - никого не садим в автобус



        if (bicyclesCount < bicyclePlaces && takePassenger()) { //  place for bicycle
           // boolean isPassengerEntry = takePassenger();
          //  if (isPassengerEntry) { // passenger in bus
                bicyclesCount++;// take on board bicycle
                System.out.println("Passenger and bicycle sit in a bus " + getModel());
                return true;

            //}
        }
        System.out.println("Passenger and bicycle didn't have place in bus: " + getModel());
        return false;
    }

    public int getBicyclePlaces() {
        return bicyclePlaces;
    }


    public int getBicyclesCount() {
        return bicyclesCount;
    }

    public int example() {
        return super.getCapacity();
    }


}