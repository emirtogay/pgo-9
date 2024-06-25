public class Main {
    public static void main(String[] args) {
        Car car = new Car("BMW", "320d", 2011, 150000,200);
        System.out.println("Fuel efficiency " + car.calculateFuelEfficiency());
        Truck truck = new Truck("Volvo", "abc", 2020, 10000,10, 10000);
        System.out.println("Fuel efficiency " + truck.calculateFuelEfficiency());

    }
}