public class Main {
    public static void main(String[] args) {

        Garage garage = new Garage();
        //Passing value to the Car class constructor
        Car carOne = new Car("BMW");
        Car carTwo = new Car("Mercedes");
        Motorcycle bikeOne = new Motorcycle("Honda");
        Motorcycle bikeTwo = new Motorcycle("Ducati");

        garage.park(carOne);
        garage.park(carTwo);
        garage.park(bikeOne);
        garage.park(bikeTwo);
    }
}
