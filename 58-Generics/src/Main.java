import java.lang.reflect.GenericArrayType;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        /*Generics - enable types (classes and interfaces) to be parameter
        * when defining:
        * classes, interfaces, methods
        * a benefit is to eliminate the need to create multiple version
        * of methods or classes for various data types*/

        //If we wanted to display normally we would use a method
        //with a loop to iterate each individual Array
        //Integer[] intArray = {1, 2, 3, 4, 5};
        //Double[] doubleArray = {5.5, 4.4, 3.3, 2.2, 1.1};
        //Character[] charArray = {'H', 'E', 'L', 'L', 'O'};
        //String[] stringArray = {"B", "Y", "E"};

        //displayArray(intArray);
        //displayArray(doubleArray);
        //displayArray(charArray);
        //displayArray(stringArray);

        //System.out.println(getFirstElement(intArray));
        //System.out.println(getFirstElement(doubleArray));
        //System.out.println(getFirstElement(charArray));
        //System.out.println(getFirstElement(stringArray));

        //Example:
        /*Player player = new Player();
        Enemy enemy = new Enemy();
        Item item = new Item();
        Tree tree = new Tree();

        draw(player);
        draw(enemy);
        draw(item);
        draw(tree);*/

        //IntegerClass myInt = new IntegerClass(1);
        //DoubleClass myDouble = new DoubleClass(3.14);
        //CharacterClass myChar = new CharacterClass('@');
        //StringClass myString = new StringClass("Hello");

        //System.out.println(myInt.getValue());
        //System.out.println(myDouble.getValue());
        //System.out.println(myChar.getValue());
        //System.out.println(myString.getValue());

        //GenericClass<Integer> myInt = new GenericClass<>(1);
        //GenericClass<Double> myDouble = new GenericClass<>(3.14);
        //GenericClass<Character> myChar = new GenericClass<>('@');
        //GenericClass<String > myString = new GenericClass<>("Hello");

        GenericClass<Integer, Integer> myInt = new GenericClass<>(1, 2);
        GenericClass<Double, Double> myDouble = new GenericClass<>(3.14, 5.5);
        GenericClass<Character, Character> myChar = new GenericClass<>('@', '?');
        GenericClass<String, Character> myString = new GenericClass<>("Hello", '!');

        System.out.println(myInt.getValue());
        System.out.println(myDouble.getValue());
        System.out.println(myChar.getValue());
        System.out.println(myString.getValue());



    }

    /*public static <T> void draw(T x) {
        x.draw();
    }*/

    //Using generic method. Only one to iterate all the arrays
    /*public static <T> void displayArray(T[] array) {

        for(T x : array) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static <T2> T2 getFirstElement (T2[] array) {
        return array[0];
    }*/

    //Using 4 different methods the iterated over the 4 arrays
    /*public static void displayArray (Integer[] array) {
        for (Integer x:
             array) {
            System.out.println(x + " ");
        }
        System.out.println();
    }
    public static void displayArray (Double[] array) {
        for (Double x:
                array) {
            System.out.println(x + " ");
        }
        System.out.println();
    }
    public static void displayArray (Character[] array) {
        for (Character x:
                array) {
            System.out.println(x + " ");
        }
        System.out.println();
    }
    public static void displayArray (String[] array) {
        for (String x:
                array) {
            System.out.println(x + " ");
        }
        System.out.println();
    }*/
}
