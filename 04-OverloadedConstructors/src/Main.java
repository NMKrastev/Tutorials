public class Main {
    public static void main(String[] args) {

        //Overloaded Constructors - multiple constructors within a class
        //with the same name, but have different parameters.
        //name + parameter = signature

        //String bread, String sauce, String cheese, String topping
        System.out.println("Your pizza ingredients: ");
        Pizza pizza = new Pizza("thin and crust", "tomato", "mozzarella", "garlic");

    }
}
