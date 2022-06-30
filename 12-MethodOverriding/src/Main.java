public class Main {
    public static void main(String[] args) {

        //method overriding - declaring a method in subclass,
        //which is already present in a parent class.
        //This is done so that a child class can give its own implementation

        Animal animal = new Animal();
        Cat cat = new Cat();

        animal.speak();
        cat.speak();

    }
}
