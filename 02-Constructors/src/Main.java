public class Main {
    public static void main(String[] args) {

        Human humanJohn = new Human("John", 35, 85);
        Human humanBob = new Human("Bob", 24, 90);

        System.out.println(humanJohn.name);
        System.out.println(humanBob.name);

        humanBob.eat();
        humanJohn.drink();
    }
}
