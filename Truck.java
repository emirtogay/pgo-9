public class Truck extends Car {
    private double milesDriven;
    private double fuelConsumed;
    private double cargoWeight;

    public Truck(String make, String model, int year, double milesDriven, double fuelConsumed, double cargoWeight){
        super(make, model, year, milesDriven, fuelConsumed);
        this.milesDriven = milesDriven;
        this.fuelConsumed = fuelConsumed;
        this.cargoWeight = cargoWeight;
    }

    @Override
    public double calculateFuelEfficiency() {
        return milesDriven / (fuelConsumed + cargoWeight *0.5);
    }

    @Override
    public double getFuelConsumed() {
        return fuelConsumed;
    }

    public double getCargoWeight() {
        return cargoWeight;
    }

    @Override
    public double getMilesDriven() {
        return milesDriven;
    }
}
