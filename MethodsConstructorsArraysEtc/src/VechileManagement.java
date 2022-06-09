public class VechileManagement {
    public static void main(String[] args) {

        Cars mercedes = new Cars();
        Cars bmw = new Cars();

        Vehicle carOne = mercedes;
        Vehicle carTwo = new Vehicle();
        mercedes.move(); //Uses the override method ot Cars class and not the Vehicle move() method
        carTwo.move();
        //SuperCar ferrari = new SuperCar();

        //mercedes.numberOfWheels = 4;

        Bike r1 = new Bike();
        Bike s1000rr = new Bike();

        //r1.numberOfWheels = 2;
        //s1000rr.numberOfWheels = 2;

        bmw.move();
        s1000rr.printNumberOfWheels();
        //ferrari.engageTurbo();
        System.out.println();
    }
}
