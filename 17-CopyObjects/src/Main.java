public class Main {
    public static void main(String[] args) {

        Car carOne = new Car("Mercedes", "GLC Class", 2022);
        Car carTwo = new Car("BMW", "X5", 2022);

        //This will only make the same object and carTwo will point
        //to the same memory as carOne
        //carTwo = carOne;

        //Created a copy method in Car class so the attributes are copied
        //and the memory spot is different
        //carTwo.copy(carOne);

        //Coping carOne as we instantiated car object
        Car carThree = new Car(carOne);

        System.out.println(carOne);
        System.out.println(carTwo);
        System.out.println();
        System.out.println(carOne.getMake());
        System.out.println(carOne.getModel());
        System.out.println(carOne.getYear());
        System.out.println();
        System.out.println(carThree.getMake());
        System.out.println(carThree.getModel());
        System.out.println(carThree.getYear());
    }
}
