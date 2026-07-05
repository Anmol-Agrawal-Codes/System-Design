import Strategy.DriverStrategy;

public class Vehicle {
    DriverStrategy strategy;

    public Vehicle(DriverStrategy strategy) {
        this.strategy = strategy;
    }

    public void drive() {
        strategy.drive();
    }
}
