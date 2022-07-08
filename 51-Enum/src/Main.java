enum Planets {
    MERCURY(1),
    VENUS(2),
    EARTH(3),
    MARS(4),
    JUPITER(5),
    SATURN(6),
    URANUS(7),
    NEPTUNE(8),
    PLUTO(9);

    int number;

    Planets(int number) {
        this.number = number;
    }
}

public class Main {
    public static void main(String[] args) {

        //enum - enumerated (ordered listing of items in a collection)
        //grouping of constants that behave similarly to objects
        //when we create an enum they are constants - cannot be changed!!!

        //instantiated like an object but instead of typing new Planets
        //it's just Planets. and you choose one of the enums
        Planets planet = Planets.JUPITER;

        canILiveHere(planet);

    }

    static void canILiveHere(Planets planet) {
        switch (planet) {
            case EARTH :
                System.out.println("You can live here!");
                System.out.println("This is planet number: " + planet.number);
                break;
            default:
                System.out.println("You cannot live here!");
                System.out.println("This is planet number: " + planet.number);
                break;
        }
    }
}
