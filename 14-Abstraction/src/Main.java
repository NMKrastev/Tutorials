public class Main {
    public static void main(String[] args) {

        //abstract- - abstract classes cannot be instantiated,
        //but the can have a subclass.
        //abstract methods are declared without an implementation
        //Example:
        /*If someone goes to the dealership and ask for a vehicle but
         does not specify what kind he should not be able to
         take any. He should specify the exact kind.
         That is why the Vihicle class is abstract*/
        //Vehicle vehicle = new Vehicle();
        Car car = new Car();

        car.drive();

    }
}
