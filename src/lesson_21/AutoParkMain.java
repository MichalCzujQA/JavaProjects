package lesson_21;

public class AutoParkMain {
    public static void main(String[] args) {
        BusDriver busDriver = new BusDriver("LN-12345542");

        AutoBus bus = new AutoBus(busDriver, 25);


        System.out.println(bus.toString());

        BusDriver busDriver1 = new BusDriver("AE-43413411");

        bus.setDriver(busDriver1);
        System.out.println(bus.toString());

        Passenger passenger = new Passenger("John");
        Passenger passenger1 = new Passenger("Margo");
        Passenger passenger2 = new Passenger("Smyph");
        Passenger passenger3 = new Passenger("Piter");
        Passenger passenger4 = new Passenger("Hanna");
        Passenger passenger5 = new Passenger("Sebastian");

        bus.takePassenger(passenger);
        bus.takePassenger(passenger1);
        bus.takePassenger(passenger2);
        bus.takePassenger(passenger3);
        bus.takePassenger(passenger4);
        bus.takePassenger(passenger5);

        System.out.println(bus.getStringPassengersList());
        System.out.println("============================");
        System.out.println(bus.getStringPassengersList());


    }
}
