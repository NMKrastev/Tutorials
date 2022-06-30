public class Main {
    public static void main(String[] args) {

        //super - keyword refers to the superclass (parent) of an object
        //very similar to the "this" keyword

        Hero heroOne = new Hero("Batman", 42, "money");
        Hero heroTwo = new Hero("Spider-man", 18, "Super senses/Web/Strong");

        //Displays the same
        System.out.println(heroTwo);
        System.out.println(heroTwo.toString());

    }
}
