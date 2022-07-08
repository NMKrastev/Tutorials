import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        //Method chaining - a common syntax for invoking multiple method calls in OOP
        //condense code into fewer lines

        String name = "         Nikola";

        //name = name.concat(" code   ");
        //name = name.toUpperCase();
        //name = name.trim();

        name = name.concat(" code   ").toUpperCase().trim();

        System.out.println(name);

    }
}
