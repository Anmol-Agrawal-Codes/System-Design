public class SpecialVehicle extends Vehicle{

    public SpecialVehicle() {
        super(new Strategy.SpecialDriveStrategy());
    }
}
