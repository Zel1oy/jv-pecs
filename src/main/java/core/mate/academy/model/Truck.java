package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int seats;
    private int enginePower;

    public Truck() {
    }

    public Truck(int seats, int enginePower) {
        this.seats = seats;
        this.enginePower = enginePower;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
