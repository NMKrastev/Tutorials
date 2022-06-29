public class Pizza {
    String bread;
    String sauce;
    String cheese;
    String topping;

    Pizza() {
        System.out.println("You don't have a pizza!");
    }

    Pizza(String bread) {
        this.bread = bread;
        System.out.println(bread);
    }

    Pizza(String bread, String sauce) {
        this.bread = bread;
        this.sauce = sauce;
        System.out.println(bread);
        System.out.println(sauce);
    }
    Pizza(String bread, String sauce, String cheese) {
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
        System.out.println(bread);
        System.out.println(sauce);
        System.out.println(cheese);
    }
    Pizza(String bread, String sauce, String cheese, String topping) {
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
        this.topping = topping;
        System.out.println(bread);
        System.out.println(sauce);
        System.out.println(cheese);
        System.out.println(topping);
    }
}
