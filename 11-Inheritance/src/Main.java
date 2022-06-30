public class Main {
    public static void main(String[] args) {

        //Inheritance - the process where one class acquires,
        //the attributes and methods of another

        Car car = new Car();
        Motorcycle bike = new Motorcycle();

        car.drive();
        bike.stop();

        System.out.println(car.speed);
        System.out.println(bike.speed);

        System.out.println(car.doors);
        System.out.println(bike.pads);
    }
}
