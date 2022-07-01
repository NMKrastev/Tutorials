public class Main {
    public static void main(String[] args) {

        /*Encapsulation - attributes of a class will be hidden or private.
          Can be accessed only through methods (getters & setters).
          You should make attributes private if you don't have a
          reason to make them public or protected*/

        Car car = new Car("Mercedes", "GLC Class", 2022);

        //In order to access the make, model or year getter methods are created in Car class
        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());

        //In order to change make, model or year setter methods are created in Car class
        car.setYear(2023);
        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());


    }
}
