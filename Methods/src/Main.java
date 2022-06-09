import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Uses Car class
        //Car myFirstCar = new Car();
        /*Car mySecondCar = new Car();
        System.out.println(myFirstCar.make);
        System.out.println(myFirstCar.model);
        System.out.println();
        System.out.println(mySecondCar.make);
        System.out.println(mySecondCar.model);

        myFirstCar.drive();
        myFirstCar.brake();*/
        //System.out.println(myFirstCar.toString());
        //System.out.println(myFirstCar);

        //Uses Human class
        String name = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        double weight = Double.parseDouble(scanner.nextLine());
        Human humanOne = new Human(name, age, weight);
        //Human humanTwo = new Human(name, age, weight);

        System.out.println(humanOne.name);
        //System.out.println(humanTwo.name);

        humanOne.introduction();
        //humanTwo.introduction();

        //humanTwo.eat();
        //humanOne.drink();

        //Uses Pizza class
        /*Pizza pizza = new Pizza("thick crust", "tomato", "mozzarella", "pepperoni");
        System.out.println("Here are the ingredients of your pizza:");
        System.out.println(pizza.bread);
        System.out.println(pizza.sauce);
        System.out.println(pizza.cheese);
        System.out.println(pizza.topping);*/

    }
}
