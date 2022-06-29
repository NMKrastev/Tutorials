public class Main {
    public static void main(String[] args) {

        Car myCar1 = new Car();
        //Still does the same thing. Will be explained in the next tutorial
        Car myCar2 = new Car();

        System.out.println(myCar1.make);
        System.out.println(myCar1.model);

        myCar1.drive();
        myCar1.brake();
    }
}
