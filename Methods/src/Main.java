public class Main {

    public static void main(String[] args) {

        Car myFirstCar = new Car();
        Car mySecondCar = new Car();
        System.out.println(myFirstCar.make);
        System.out.println(myFirstCar.model);
        System.out.println();
        System.out.println(mySecondCar.make);
        System.out.println(mySecondCar.model);

        myFirstCar.drive();
        myFirstCar.brake();
    }
}
