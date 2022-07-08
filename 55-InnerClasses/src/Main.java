public class Main {
    public static void main(String[] args) {

        /*inner class - A class inside another class.
       Useful if a class should be limited in scope.
       Usually private, but not necessary.
       Helps group classes that belong together.
       Extremely useful for listeners for specific events.
       Precursor for anonymous inner classes
        */

        Outside out = new Outside();
        Outside.Inside inside = out.new Inside();

        System.out.println(out.x + inside.y);

        inside.greeting();
    }
}
