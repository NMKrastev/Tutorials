import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //dynamic polymorphism - after compilation(during runtime)

        //example:
        //Mercedes is a: Mercedes, and a car, and a vehicle, and an object

        Animal animal;

        System.out.println("What animal do you choose?");
        System.out.print("1 = dog or 2 = cat: ");
        int choice = Integer.parseInt(scanner.nextLine());

        if (choice == 1) {
            animal = new Dog();
            animal.speak();
        } else if (choice == 2) {
            animal = new Cat();
            animal.speak();
        } else {
            animal = new Animal();
            System.out.println("Invalid choice");
            animal.speak();
        }

    }
}
