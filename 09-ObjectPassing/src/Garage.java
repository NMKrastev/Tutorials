public class Garage {

    //Getting the value from the Car constructor
    //using a simple method which take as a parameter Car class
    void park(Car car) {
        System.out.println("The " + car.name + " is parked in the garage.");
    }

    //Creating overloaded method for Motorcycle class
    void park (Motorcycle bike) {
        System.out.println("The " + bike.name + " is parked in the garage.");
    }
}
