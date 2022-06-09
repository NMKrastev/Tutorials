public class Bike extends Vehicle {

    Integer numberOfWheels;
    @Override
    public void move() {
        System.out.println("Move the vehicle in Vehicle class");
    }

    public void printNumberOfWheels() {
        numberOfWheels = 2;
        System.out.println(numberOfWheels);
        System.out.println(super.numberOfWheels);
    }
}
