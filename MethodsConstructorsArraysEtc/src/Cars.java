public class Cars extends Vehicle {

    @Override
    public void move() {
        System.out.println("Move method in Cars class");
    }

    public void behaviorSpecificToCars() {
        System.out.println("4WD");
    }

}
