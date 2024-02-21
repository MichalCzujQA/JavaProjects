package lesson_21;

public class AutoBus {

    private BusDriver driver;
    private final Autopilot autopilot;

    private int capacity;

    private final Passenger[] passengers;
    private int countPassenger;

    public AutoBus(BusDriver busDriver, int capacity) {
        this.driver = busDriver;
        busDriver.setAutoBus(this);
        autopilot = new Autopilot("AP-005");
        this.capacity = capacity;
        this.passengers = new Passenger[capacity];
    }

    public boolean takePassenger(Passenger passenger) {
        if (countPassenger < capacity) {

            passengers[countPassenger] = passenger;
            countPassenger++;
            System.out.println("Пассажир зашел в автобус");
            return true;

        }
        System.out.println("Автобус полный! Пассажир не смог зайти");
        return false;
    }


    public void setDriver(BusDriver driver) {
        this.driver = driver;
        driver.setAutoBus(this);
    }

    public Autopilot getAutopilot() {
        return autopilot;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Autobus: {" + "driver: ");
        sb.append(driver.getLicenseNumber())
                .append("; autopilot: ").append(autopilot.getSoftwareVersion());
        sb.append("passengers: ").append(getStringPassengersList());
        sb.append(" }");
        return toString();

//        return "Autobus: {" + "driver: " + driver.getLicenseNumber() + "; autopilot: "
//                + autopilot.getSoftwareVersion() + "}";
    }

    public String getStringPassengersList() {
        StringBuilder sb = new StringBuilder("{");
        for (int i = 0; i < passengers.length; i++) {
            if (passengers[i] != null) {
                Passenger current = passengers[i];
                sb.append("{Passenger: id: ").append(current.getId())
                        .append("; name: ").append(current.getName()).append(" }");

                sb.append("; ");
                if (sb.length() > 1) {
                    sb.setLength(sb.length() - 2);
                }
            }
        }
        sb.append("}");
        return sb.toString();
    }


}
