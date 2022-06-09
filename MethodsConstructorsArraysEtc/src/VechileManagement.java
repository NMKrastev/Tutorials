public class VechileManagement {
    public static void main(String[] args) {

        Cars mercedes = new Cars();
        Cars bmw = new Cars();
        SuperCar ferrari = new SuperCar();

        mercedes.numberOfWheels = 4;


        Bike r1 = new Bike();
        Bike s1000rr = new Bike();

        r1.numberOfWheels = 2;
        s1000rr.numberOfWheels = 2;

        bmw.move();
        ferrari.engageTurbo();
        System.out.println();
    }
}
